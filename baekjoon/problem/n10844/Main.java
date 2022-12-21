package n10844;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());

        BigInteger[][] dp = new BigInteger[count][10];

        dp[0][0] = BigInteger.ZERO;

        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = BigInteger.ONE;
        }

        for (int i = 1; i < count; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j + 1];
                } else if (j == 9) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j + 1].add(dp[i - 1][j - 1]);
                }
            }
        }

        System.out.println(Arrays.stream(dp[count - 1]).reduce(BigInteger::add).orElse(BigInteger.ZERO).mod(BigInteger.valueOf(1000000000)));
    }
}