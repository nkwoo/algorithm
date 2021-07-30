import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Title : 최소, 최대
 * Link : https://www.acmicpc.net/problem/10818
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberCount = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());

        List<Integer> inputList = new ArrayList<>();

        while (tokenizer.hasMoreTokens()) {
            inputList.add(Integer.parseInt(tokenizer.nextToken()));
        }

        if (inputList.size() == numberCount) {
            System.out.println(inputList.stream().mapToInt(value -> value).min().orElse(0) + " " + inputList.stream().mapToInt(value -> value).max().orElse(0));
        }

        bufferedReader.close();
    }
}