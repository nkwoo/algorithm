package n10808;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

/***
 * 문제 번호 : 10808<p>
 * 분류 : 구현, 문자열
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int[] alphabetArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (char ch : br.readLine().toCharArray()) {
            alphabetArray[ch - 97] += 1;
        }

        System.out.println(Arrays.stream(alphabetArray).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
