package n10807;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/***
 * 문제번호 : 10807<p>
 * 분류 : 구현
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vCount = 0;

        int count = Integer.parseInt(br.readLine());

        int[] array = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());

        for (int number : array) {
            if (number == v) vCount++;
        }

        System.out.println(vCount);
    }
}
