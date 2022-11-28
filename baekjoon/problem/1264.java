import java.lang.*;
import java.util.Scanner;

/**
 * Title : 모음의 개수
 * Link : https://www.acmicpc.net/problem/1264
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        int counter;

        while (true) {
            text = scanner.nextLine().toLowerCase();

            if ("#".equals(text.trim())) {
                break;
            }

            counter = 0;

            for (char ch: text.toCharArray()) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    counter++;
                }
            }

            System.out.println(counter);
        }
    }
}
