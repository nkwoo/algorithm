package n2587;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/***
 * 문제 번호 : 2587<p>
 * 분류 : 수학, 구현, 정렬, 사칙연산
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sumNumber = 0;

        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(br.readLine());

            sumNumber += number;

            array[i] = number;
        }

        Arrays.sort(array);

        System.out.println(sumNumber / 5);
        System.out.println(array[array.length / 2]);
    }
}
