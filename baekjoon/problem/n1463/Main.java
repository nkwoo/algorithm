package n1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());

        int[] dp = new int[number + 1];

        for (int i = 2; i <= number; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
        }

        System.out.println(dp[number]);
    }
}
