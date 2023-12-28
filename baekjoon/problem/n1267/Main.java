package n1267;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/***
 * 문제 번호 : 1267<p>
 * 분류 : 수학, 사칙연산
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int yungSikSum = 0;
        int minSikSum = 0;

        for (int j = 0; j < count; j++) {
            int telSecond = Integer.parseInt(st.nextToken());

            yungSikSum += ((telSecond / 30) + (telSecond % 30 >= 0 ? 1 : 0)) * 10;
            minSikSum += ((telSecond / 60) + (telSecond % 60 >= 0 ? 1 : 0)) * 15;
        }

        if (minSikSum < yungSikSum) {
            System.out.println("M " + minSikSum);
        } else if (minSikSum == yungSikSum) {
            System.out.println("Y M " + minSikSum);
        } else {
            System.out.println("Y " + yungSikSum);
        }
    }
}
