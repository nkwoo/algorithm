package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Chap1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("[" + Arrays.stream(solution(bufferedReader.readLine())).mapToObj(String::valueOf).collect(Collectors.joining(",")) + "]");
    }

    public static int[] solution(String s) {
        char[] chars = s.toCharArray();
        int[] answers = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int answer = -1;

            for (int j = i - 1; j >= 0 ; j--) {
                if (c == chars[j]) {
                    answer = i - j;
                    break;
                }
            }
            answers[i] = answer;
        }

        return answers;
    }
}