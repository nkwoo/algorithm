import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Title : A + B - 3
 * Link : https://www.acmicpc.net/problem/10950
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int sumCount = scanner.nextInt();

            List<Integer> sumList = new ArrayList<>();

            for (int count = 0; count < sumCount; count++) {
                int firstNumber = scanner.nextInt();
                int secondNumber = scanner.nextInt();

                List<Integer> numberList = Stream.of(firstNumber, secondNumber).filter(number -> 0 < number && number < 10).collect(Collectors.toList());

                if (numberList.size() != 2)
                    throw new RuntimeException("입력한 정수는 0보다 커야하고 10보다 작아야 합니다.");

                sumList.add(numberList.stream().mapToInt(value -> value).sum());
            }

            sumList.forEach(System.out::println);
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}