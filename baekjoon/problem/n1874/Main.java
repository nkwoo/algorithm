package n1874;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/***
 * 문제번호 : 1874<p>
 * 분류 : 자료 구조, 스택
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int index = 1;

        List<Character> flagList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int j = 0; j < n; j++) {
            int k = Integer.parseInt(br.readLine());

            while (stack.isEmpty() || stack.peek() < k) {
                stack.push(index++);
                flagList.add('+');
            }

            if (!stack.isEmpty()) stack.pop();
            flagList.add('-');
        }

        if (index - 1 == n) {
            flagList.forEach(System.out::println);
        } else {
            System.out.println("NO");
        }
    }
}
