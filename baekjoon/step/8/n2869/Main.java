package n2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Title : 달팽이는 올라가고 싶다
 * Link : https://www.acmicpc.net/problem/2869
 * Feedback : 첫번째 시도에는 반복문을 돌려 처리하였으나 시간 제한이 있다는거에 처리방법을 바꿧다.
 *            두번째 시도에는 정상을 올라간 후에는 미끄러지지 않는다는 것을 후처리로 계산을 했는데
 *            후처리로 하다보니 앞에서 카운팅 되는 일수도 달라지고 막 -2 일 같은 결과가 나왔다.
 *            선처리로 변환하고 풀이를 하였으나 너무 답답한 나머지 질문 검색을 통해서 풀이하게 되었다.
 *            수학적 사고와 주어진 시간을 잘 활용할 수 있도록 개선해야겠다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());

        int afternoonHeight = Integer.parseInt(tokenizer.nextToken());
        int nightHeight = Integer.parseInt(tokenizer.nextToken());
        int totalHeight = Integer.parseInt(tokenizer.nextToken());

        System.out.println((totalHeight - nightHeight) / (afternoonHeight - nightHeight) + ((totalHeight - nightHeight) % (afternoonHeight - nightHeight) != 0 ? 1 : 0));
    }
}
