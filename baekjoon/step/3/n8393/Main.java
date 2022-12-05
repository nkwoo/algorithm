package n8393;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Title : 합
 * Link : https://www.acmicpc.net/problem/8393
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int sumCount = scanner.nextInt();

            if (!(1 <= sumCount && sumCount <= 10000))
                throw new RuntimeException("입력한 정수는 1 이상 10000 이하 여야합니다.");

            int totalSum = 0;

            for (int count = 1; count <= sumCount; count++) {
                totalSum += count;
            }

            System.out.println(totalSum);
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
