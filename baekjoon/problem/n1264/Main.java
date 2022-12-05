package n1264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

/**
 * Title : 모음의 개수
 * Link : https://www.acmicpc.net/problem/1264
 * Feedback : 코드 리뷰 결과
 *            1. Scanner는 백준에서 속도를 잡아먹는다 (정규식 파싱을 하기 때문에)
 *            2. text와 counter는 내부에서 사용되는데 왜 밖으로 뺀건가
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String text = bufferedReader.readLine().trim().toLowerCase();

            if ("#".equals(text)) {
                break;
            }

            int counter = 0;

            for (char ch: text.toCharArray()) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    counter++;
                }
            }

            System.out.println(counter);
        }
    }
}
