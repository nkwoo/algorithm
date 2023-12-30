package n11328;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/***
 * 문제번호 : 11328<p>
 * 분류 : 구현, 문자열
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String[] array = new String[count];

        for (int i = 0; i < count; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            String firstWord = st2.nextToken();
            String secondWord = st2.nextToken();

            if (firstWord.equals(secondWord)) {
                array[i] = "Possible";
                continue;
            }

            if (firstWord.length() != secondWord.length()) {
                array[i] = "Impossible";
                continue;
            }

            char[] firstWordArray = firstWord.toCharArray();
            char[] secondWorkArray = secondWord.toCharArray();

            Arrays.sort(firstWordArray);
            Arrays.sort(secondWorkArray);

            array[i] = String.valueOf(firstWordArray).equals(String.valueOf(secondWorkArray)) ? "Possible" : "Impossible";
        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
