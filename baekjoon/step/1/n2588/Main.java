package n2588;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Title : 곱셈
 * Link : htps://www.acmicpc.net/problem/2588
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();

            System.out.println(firstNumber * (secondNumber % 10));
            System.out.println(firstNumber * ((secondNumber / 10) % 10));
            System.out.println(firstNumber * ((secondNumber / 100) % 10));
            System.out.println(firstNumber * secondNumber);
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
