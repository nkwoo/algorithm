package n2576;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/***
 * 문제 번호 : 2576<p>
 * 분류 : 수학, 구현
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int minNumber = Integer.MAX_VALUE;
        int sumNumber = 0;

        for (int i = 0; i < 7; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number % 2 == 0) continue;

            sumNumber += number;

            if (minNumber > number) minNumber = number;
        }

        if (sumNumber == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sumNumber);
            System.out.println(minNumber);
        }
    }
}
