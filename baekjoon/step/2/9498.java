import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Title : 시험 성적
 * Link : https://www.acmicpc.net/problem/9498
 */
public class Main {
    public static String getScoreByCredit(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int score = scanner.nextInt();

            if (!(0 <= score && score <= 100))
                throw new RuntimeException("시험점수는 0점부터 100점까지 입니다.");

            System.out.println(getScoreByCredit(score));
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}