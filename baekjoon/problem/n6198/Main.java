package n6198;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/***
 * 문제번호 : 6198<p>
 * 분류 : 구현, 스택<p>
 * 피드백 : <a href="https://nkwoo.tistory.com/18">백준 6198번 / 옥상 정원 꾸미기</a>
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Long count = 0L;

        Stack<Integer> inStack = new Stack<>();
        Stack<Tower> calcStack = new Stack<>();

        for (int i = 1; i <= n; i++) {
            inStack.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 1; i <= n; i++) {
            if (calcStack.isEmpty()) {
                calcStack.push(new Tower(inStack.pop(), 0));
                continue;
            }

            Integer k = inStack.pop();

            int sum = 0;

            while (!calcStack.isEmpty() && k > calcStack.peek().getHeight()) {
                Tower pop = calcStack.pop();

                sum += pop.getSubCount();
                sum++;
            }

            count += sum;
            calcStack.push(new Tower(k, sum));
        }

        System.out.println(count);
    }

    public static class Tower {
        private final Integer height;
        private final Integer subCount;

        public Tower(Integer height, Integer subCount) {
            this.height = height;
            this.subCount = subCount;
        }

        public Integer getHeight() {
            return height;
        }

        public Integer getSubCount() {
            return subCount;
        }
    }
}
