package n2739;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Title : 구구단
 * Link : https://www.acmicpc.net/problem/2739
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int multiplicationNumber = scanner.nextInt();

            if (!(1 <= multiplicationNumber && multiplicationNumber <= 9))
                throw new RuntimeException("곱할 수는 1보다 크고 9보다 작아야 합니다.");

            for (int count = 1; count <= 9; count++) {
                System.out.println(multiplicationNumber + " * " + count + " = " + multiplicationNumber * count);
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
