package n10953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Title : A+B - 6
 * Link : https://www.acmicpc.net/problem/10953
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int range = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < range; i++) {
            System.out.println(Arrays.stream(bufferedReader.readLine().split(",")).map(Integer::parseInt).mapToInt(value -> value).sum());
        }
    }
}
