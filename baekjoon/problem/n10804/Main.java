package n10804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/***
 * 문제 번호 : 10804<p>
 * 분류 : 구현, 시뮬레이션
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int startPosition = Integer.parseInt(st.nextToken()) - 1;
            int endPosition = Integer.parseInt(st.nextToken()) - 1;

            for (int j = 0; j < ((endPosition - startPosition + 1) / 2); j++) {
                int before = startPosition + j;
                int after = endPosition - j;

                int swap = array[before];
                array[before] = array[after];
                array[after] = swap;
            }
        }

        System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
