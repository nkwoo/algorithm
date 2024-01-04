package n2493;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/***
 * 문제번호 : 2493<p>
 * 분류 : 자료 구조, 스택<p>
 * 피드백 : <a href="https://blog.nkwoo.net/17">백준 2493번 / 탑</a>
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Tower> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            Tower tower = new Tower(i, Integer.parseInt(st.nextToken()));

            if (stack.isEmpty()) {
                sb.append("0").append(" ");
            } else if (stack.peek().height > tower.height) {
                sb.append(stack.peek().index).append(" ");
            } else {
                int size = stack.size();

                int printIndex = 0;

                for (int j = 0; j < size; j++) {
                    if (stack.peek().height < tower.height) {
                        stack.pop();
                    } else {
                        printIndex = stack.peek().index;
                        break;
                    }
                }

                sb.append(printIndex).append(" ");
            }

            stack.push(tower);
        }

        System.out.println(sb);
    }


    public static class Tower {
        private final Integer index;
        private final Integer height;

        public Tower(Integer index, Integer height) {
            this.index = index;
            this.height = height;
        }
    }
}

