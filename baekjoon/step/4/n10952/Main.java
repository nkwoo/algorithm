package n10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Title : A + B - 5
 * Link : https://www.acmicpc.net/problem/10952
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> inputList = new ArrayList<>();

        StringTokenizer tokenizer;

        int firstNumber, secondNumber;

        do {
            tokenizer = new StringTokenizer(reader.readLine());

            firstNumber = Integer.parseInt(tokenizer.nextToken());
            secondNumber = Integer.parseInt(tokenizer.nextToken());

            if (firstNumber != 0 && secondNumber != 0)
                inputList.add(firstNumber + secondNumber);

        } while (firstNumber != 0 && secondNumber != 0);

        inputList.forEach(System.out::println);

        reader.close();
    }
}
