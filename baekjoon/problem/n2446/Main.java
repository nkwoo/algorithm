package n2446;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/***
 * 문제 번호 : 2446<p>
 * 분류 : 구현
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int flag = 1;

        for (int i = count; count >= i; i -= flag) {
            for (int k = 0; k < (count - i); k++) System.out.print(" ");
            for (int j = 0; j < (i * 2 - 1); j++) System.out.print("*");
            System.out.println();

            if (i == 1) flag = -1;
        }
    }
}
