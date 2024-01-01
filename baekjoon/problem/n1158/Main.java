package n1158;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/***
 * 문제번호 : 1158<p>
 * 분류 : 구현, 자료 구조, 큐
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        int index = 1;

        for (int j = 1; j <= n; j++) {
            queue.offer(j);
        }

        StringBuilder sb = new StringBuilder("<");

        while (!queue.isEmpty()) {
            if (index == k || queue.size() == 1) {
                sb.append(queue.poll());
                if (!queue.isEmpty()) {
                    sb.append(", ");
                }
                index = 1;
            } else {
                queue.offer(queue.poll());
                index++;
            }
        }

        sb.append(">");

        System.out.println(sb);
    }
}
