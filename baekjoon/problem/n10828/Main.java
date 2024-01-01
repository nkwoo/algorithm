package n10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/***
 * 문제번호 : 10828<p>
 * 분류 : 구현, 자료 구조, 스택
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();

        for (int j = 0; j < n; j++) {
            String[] commands = br.readLine().split(" ");

            switch (commands[0]) {
                case "push":
                    stack.push(Integer.parseInt(commands[1]));
                    break;
                case "pop":
                    System.out.println(!stack.isEmpty() ? stack.pop() : -1);
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(!stack.isEmpty() ? 0 : 1);
                    break;
                case "top":
                    System.out.println(!stack.isEmpty() ? stack.peek() : -1);
                    break;
            }
        }
    }
}
