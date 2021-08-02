import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Title : 상수
 * Link : https://www.acmicpc.net/problem/2908
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> inputList = new ArrayList<>();

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        while (tokenizer.hasMoreTokens()) {
            inputList.add(Integer.parseInt(new StringBuilder(tokenizer.nextToken()).reverse().toString()));
        }

        System.out.println(inputList.stream().mapToInt(value -> value).max().orElse(0));

        reader.close();
    }
}