package n5397;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/***
 * 문제번호 : 5397<p>
 * 분류 : 자료구조, 스택, 연결 리스트
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < count; j++) {
            Stack<Character> leftStack = new Stack<>();
            Stack<Character> rightStack = new Stack<>();

            String[] array = br.readLine().split("");

            for (String word : array) {
                if ("<".equals(word)) {
                    if (!leftStack.isEmpty()) rightStack.push(leftStack.pop());
                } else if (">".equals(word)) {
                    if (!rightStack.isEmpty()) leftStack.push(rightStack.pop());
                } else if ("-".equals(word)) {
                    if (!leftStack.isEmpty()) leftStack.pop();
                } else {
                    leftStack.push(word.charAt(0));
                }
            }

            while (!leftStack.isEmpty())
                rightStack.push(leftStack.pop());

            while (!rightStack.isEmpty())
                sb.append(rightStack.pop());

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
