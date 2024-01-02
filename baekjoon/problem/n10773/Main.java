package n10773;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/***
 * 문제번호 : 10773<p>
 * 분류 : 구현, 자료 구조, 스택
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        int k = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int j = 0; j < k; j++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(n);
            }
        }

        while (!stack.isEmpty())
            sum += stack.pop();

        System.out.println(sum);
    }
}
