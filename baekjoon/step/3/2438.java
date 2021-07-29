import java.util.Scanner;

/**
 * Title : 별 찍기 - 1
 * Link : https://www.acmicpc.net/problem/2438
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCount = scanner.nextInt();

        StringBuilder builder = new StringBuilder();

        for (int rowindex = 1; rowindex <= lineCount; rowindex++) {
            for (int cellIndex = 1; cellIndex <= rowindex; cellIndex++) {
                builder.append("*");
            }
            builder.append("\n");
        }

        System.out.println(builder);
    }
}