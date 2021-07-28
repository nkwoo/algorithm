import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Title : 사칙연산
 * Link : htps://www.acmicpc.net/problem/10869
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();

            List<Integer> numberList = Stream.of(firstNumber, secondNumber).filter(number -> 1 <= number && number <= 10000).collect(Collectors.toList());

            if (numberList.size() != 2)
                throw new RuntimeException("범위에 맞지 않습니다.");

            System.out.println(numberList.stream().reduce(Integer::sum).orElse(0));
            System.out.println(numberList.stream().reduce((first, second) -> first - second).orElse(0));
            System.out.println(numberList.stream().reduce((first, second) -> first * second).orElse(0));
            System.out.println(numberList.stream().reduce((first, second) -> first / second).orElse(0));
            System.out.println(numberList.stream().reduce((first, second) -> first % second).orElse(0));

        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}