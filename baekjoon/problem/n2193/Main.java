package n2193;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());

        BigInteger[][] dp = new BigInteger[count][2];

        dp[0][0] = BigInteger.ZERO;
        dp[0][1] = BigInteger.ONE;

        for (int i = 1; i < count; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j].add(dp[i - 1][j + 1]);
                } else {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        System.out.println(Arrays.stream(dp[count - 1]).reduce(BigInteger::add).orElse(BigInteger.ZERO));
    }
}
