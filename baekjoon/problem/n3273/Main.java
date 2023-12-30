package n3273;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/***
 * 문제번호 : 3273<p>
 * 분류 : 정렬, 두 포인터<p></p>
 * 피드백 : 문제를 풀다가 알고리즘 분류를 보고 투 포인터라는 항목을 보고 공부한뒤 다시 풀었습니다.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vCount = 0;

        int count = Integer.parseInt(br.readLine());

        int[] array = new int[count];

        int startPoint = 0, endPoint = array.length - 1, sum;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int x = Integer.parseInt(br.readLine());

        while (startPoint < endPoint) {
            sum = array[startPoint] + array[endPoint];

            if (sum == x) {
                vCount += 1;
                startPoint += 1;
                endPoint -= 1;
            } else if (sum < x) {
                startPoint += 1;
            } else {
                endPoint -= 1;
            }
        }

        System.out.println(vCount);
    }
}
