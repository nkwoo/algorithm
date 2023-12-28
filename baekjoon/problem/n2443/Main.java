package n2443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/***
 * 문제 번호 : 2443<p>
 * 분류 : 구현
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for (int i = count; i > 0; i--) {
            for (int k = 0; k < (count - i); k++) System.out.print(" ");
            for (int j = 0; j < (i * 2 - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
}
