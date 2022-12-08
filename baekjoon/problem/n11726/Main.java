package n11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());

        BigInteger[] dp = new BigInteger[number + 1];

        dp[0] = BigInteger.valueOf(1);
        dp[1] = BigInteger.valueOf(1);

        for (int i = 2; i <= number; i++) {
            dp[i] = BigInteger.ZERO.add(dp[i - 2]).add(dp[i - 1]);
        }

        System.out.println(dp[number].mod(BigInteger.valueOf(10007)));
    }
}
