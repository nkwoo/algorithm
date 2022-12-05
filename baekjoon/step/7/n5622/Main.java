package n5622;

import java.util.Scanner;

/**
 * Title : 다이얼
 * Link : https://www.acmicpc.net/problem/5622
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] words = scanner.nextLine().toCharArray();

        int minimumTime = 0;

        for (char word: words) {
            if (word <= 'C') {
                minimumTime += 2;
            } else if (word <= 'F') {
                minimumTime += 3;
            } else if (word <= 'I') {
                minimumTime += 4;
            } else if (word <= 'L') {
                minimumTime += 5;
            } else if (word <= 'O') {
                minimumTime += 6;
            } else if (word <= 'S') {
                minimumTime += 7;
            } else if (word <= 'V') {
                minimumTime += 8;
            } else if (word <= 'Z') {
                minimumTime += 9;
            }
            minimumTime += 1;
        }

        System.out.println(minimumTime);
    }
}
