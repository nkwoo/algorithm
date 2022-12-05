package n2741;

import java.util.Scanner;

/**
 * Title : N 찍기
 * Link : https://www.acmicpc.net/problem/2741
 */
public class Main {
    public static void main(String[] args) throws NumberFormatException  {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int index = 1; index <= N; index++) {
            System.out.println(index);
        }
    }
}
