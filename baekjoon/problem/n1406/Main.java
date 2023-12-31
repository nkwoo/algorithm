package n1406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/***
 * 문제번호 : 1406<p>
 * 분류 : 자료구조, 스택, 연결 리스트<p>
 * 피드백 : <a href="https://blog.nkwoo.net/15">백준 1406번 / 에디터</a>
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        String[] split = br.readLine().split("");

        for (String word : split) {
            leftStack.push(word.charAt(0));
        }

        int count = Integer.parseInt(br.readLine());

        for (int j = 0; j < count; j++) {
            String command = br.readLine();

            if (command.startsWith("P")) {
                leftStack.push(command.split(" ")[1].charAt(0));
            } else if ("L".equals(command)) {
                if (!leftStack.isEmpty()) rightStack.push(leftStack.pop());
            } else if ("D".equals(command)) {
                if (!rightStack.isEmpty()) leftStack.push(rightStack.pop());
            } else if ("B".equals(command)) {
                if (!leftStack.isEmpty()) leftStack.pop();
            }
        }

        while (!leftStack.isEmpty())
            rightStack.push(leftStack.pop());

        StringBuilder stringBuilder = new StringBuilder();

        while (!rightStack.isEmpty())
            stringBuilder.append(rightStack.pop());

        System.out.println(stringBuilder);
    }
}
