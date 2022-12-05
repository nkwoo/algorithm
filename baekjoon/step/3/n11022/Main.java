package n11022;

import java.util.Scanner;

/**
 * Title : A + B - 8
 * Link : https://www.acmicpc.net/problem/11022
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCaseCount = scanner.nextInt();

        StringBuilder builder = new StringBuilder();

        for (int index = 1; index <= testCaseCount; index++) {
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();

            builder.append("Case #")
                    .append(index)
                    .append(": ")
                    .append(firstNumber)
                    .append(" + ")
                    .append(secondNumber)
                    .append(" = ")
                    .append(firstNumber + secondNumber)
                    .append("\n");
        }

        System.out.println(builder);
    }
}
