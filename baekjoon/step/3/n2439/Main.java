package n2439;

import java.util.Scanner;

/**
 * Title : 별 찍기 - 2
 * Link : https://www.acmicpc.net/problem/2439
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCount = scanner.nextInt();

        StringBuilder builder = new StringBuilder();

        for (int rowindex = 1; rowindex <= lineCount; rowindex++) {
            for (int nbspIndex = lineCount - rowindex; 1 <= nbspIndex; nbspIndex--) {
                builder.append(" ");
            }
            for (int cellIndex = 1; cellIndex <= rowindex; cellIndex++) {
                builder.append("*");
            }
            builder.append("\n");
        }

        System.out.println(builder);
    }
}
