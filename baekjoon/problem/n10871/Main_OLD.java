package n10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * Title : X보다 작은 수
 * Link : https://www.acmicpc.net/problem/10871
 */
public class Main_OLD {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int inputCountNumber = Integer.parseInt(tokenizer.nextToken());
        int compareNumber = Integer.parseInt(tokenizer.nextToken());

        List<Integer> inputList = new ArrayList<>();

        tokenizer = new StringTokenizer(reader.readLine());

        while (tokenizer.hasMoreTokens()) {
            int number = Integer.parseInt(tokenizer.nextToken());

            if (1 <= number && number <= 10000) {
                inputList.add(number);
            }
        }

        if (inputList.size() == inputCountNumber) {
            System.out.print(inputList.stream().filter(input -> input < compareNumber).map(Object::toString).collect(Collectors.joining(" ")));
        }

        reader.close();
    }
}
