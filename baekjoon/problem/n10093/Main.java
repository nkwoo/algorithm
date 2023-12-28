package n10093;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/***
 * 문제 번호 : 10093<p>
 * 분류 : 구현<p>
 * 피드백 : 해당 문제를 풀며 여러번 시도하였으나 잘못된 점이 있어 다시 생각해본결과 A가 B보다 큰 경우일떄를 생각하여 코드를 수정하였습니다.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long startNumber = Long.parseLong(st.nextToken());
        long endNumber = Long.parseLong(st.nextToken());

        if (startNumber > endNumber) {
            long swap = startNumber;
            startNumber = endNumber;
            endNumber = swap;
        }

        long betweenNumber = endNumber - startNumber - 1;

        if (betweenNumber <= 0  || 100_000 < betweenNumber) {
            System.out.println(0);
            return;
        }

        System.out.println(betweenNumber);

        for (long i = startNumber + 1; i < endNumber; i++) {
            System.out.print(i + " ");
        }
    }
}
