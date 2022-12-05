package n10430;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Title : 나머지
 * Link : htps://www.acmicpc.net/problem/10430
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            int thirdNumber = scanner.nextInt();

            List<Integer> numberList = Stream.of(firstNumber, secondNumber, thirdNumber).filter(number -> 2 <= number && number <= 10000).collect(Collectors.toList());

            if (numberList.size() != 3)
                throw new RuntimeException("범위에 맞지 않습니다.");

            System.out.println((firstNumber + secondNumber) % thirdNumber);
            System.out.println(((firstNumber % thirdNumber) + (secondNumber % thirdNumber)) % thirdNumber);
            System.out.println((firstNumber * secondNumber) % thirdNumber);
            System.out.println(((firstNumber % thirdNumber) * (secondNumber % thirdNumber)) % thirdNumber);
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
