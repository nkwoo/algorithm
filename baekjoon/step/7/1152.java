import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Title : 단어의 개수
 * Link : https://www.acmicpc.net/problem/1152
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken();
            count++;
        }

        System.out.println(count);

        reader.close();
    }
}