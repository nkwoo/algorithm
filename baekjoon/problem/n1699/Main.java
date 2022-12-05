package n1699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title : 제곱수의 합
 * Link : https://www.acmicpc.net/problem/1699
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());

        int count = 0;

        for (int i = number; i >= 0; i--) {
            if (i * i <= number) {
                System.out.println("number = " + number);
                System.out.println("count = " + count);
                System.out.println("i = " + i);

                number -= i * i;
                count += 1;
                i += 1;
            }

            if (number <= 0) {
                break;
            }
        }

        System.out.println(count);
    }
}
