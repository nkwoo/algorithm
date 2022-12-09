package n9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());

        int[] indexes = new int[count];

        for (int i = 0; i < count; i++) {
            indexes[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int[] dp = new int[12];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= dp.length - 1; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }

        for (int i : indexes) {
            System.out.println(dp[i]);
        }
    }
}
