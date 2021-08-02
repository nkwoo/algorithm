import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Title : 문자열 반복
 * Link : https://www.acmicpc.net/problem/2675
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int caseCount = Integer.parseInt(reader.readLine());

        for (int index = 0; index < caseCount; index++) {
            StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

            int repeatCount = stringTokenizer.hasMoreTokens() ? Integer.parseInt(stringTokenizer.nextToken()) : 0;

            char[] words = (stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "").toCharArray();

            StringBuilder builder = new StringBuilder();

            for (char word: words) {
                builder.append(String.valueOf(word).repeat(repeatCount));
            }

            System.out.println(builder);
        }

        reader.close();
    }
}