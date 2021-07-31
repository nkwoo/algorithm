import java.util.Scanner;

/**
 * Title : OX퀴즈
 * Link : https://www.acmicpc.net/problem/8958
 */
public class Main {
    public static int getScore(String oxResult) {
        int score = 0;
        int extraPoint = 1;

        for (int index = 0; index < oxResult.length(); index++) {
            if ("O".equals(String.valueOf(oxResult.charAt(index)))) {
                score += extraPoint;

                extraPoint += 1;
            } else {
                extraPoint = 1;
            }
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int caseCount = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < caseCount; index++) {
            String oxResult = scanner.nextLine();

            System.out.println(getScore(oxResult));
        }
    }
}