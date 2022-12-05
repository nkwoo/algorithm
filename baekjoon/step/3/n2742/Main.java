package n2742;

import java.util.Scanner;

/**
 * Title : 기찍 N
 * Link : https://www.acmicpc.net/problem/2742
 */
public class Main {
    public static void main(String[] args) throws NumberFormatException  {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int index = N; 1 <= index; index--) {
            System.out.println(index);
        }
    }
}
