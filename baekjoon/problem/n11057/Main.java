package n11057;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());

        BigInteger[][] dp = new BigInteger[count][10];

        Arrays.fill(dp[0], BigInteger.ONE);

        for (int i = 1; i < count; i++) {
            for (int j = 0; j < 10; j++) {
                dp[i][j] = dp[i - 1][j];

                for (int k = 1; k <= j; k++) {
                    dp[i][j] = dp[i][j].add(dp[i - 1][j - k]);
                }
            }
        }

        System.out.println(Arrays.stream(dp[count - 1]).reduce(BigInteger::add).orElse(BigInteger.ZERO).mod(BigInteger.valueOf(10007)));
    }
}
