package n2577;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/***
 * 문제번호 : 2577<p>
 * 분류 : 수학, 구현, 사칙연산
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int[] numberArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int mulNumber = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            mulNumber *= Integer.parseInt(br.readLine());
        }


        for (char ch : String.valueOf(mulNumber).toCharArray()) {
            numberArray[ch - 48] += 1;
        }

        Arrays.stream(numberArray).forEach(System.out::println);
    }
}
