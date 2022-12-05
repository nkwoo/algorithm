package n1330;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Title : 두 수 비교하기
 * Link : https://www.acmicpc.net/problem/1330
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();

            List<Integer> numberList = Stream.of(firstNumber, secondNumber).filter(number -> -10000 <= number && number <= 10000).collect(Collectors.toList());

            if (numberList.size() != 2)
                throw new RuntimeException("범위에 맞지 않습니다.");

            System.out.println(firstNumber > secondNumber ? ">" : firstNumber < secondNumber ? "<" : "==");
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
