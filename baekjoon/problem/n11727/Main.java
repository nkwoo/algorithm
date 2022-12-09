package n11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());

        BigInteger[] dp = new BigInteger[number + 1];

        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.ONE;

        for (int i = 2; i <= number; i++) {
            dp[i] = dp[i - 2].multiply(BigInteger.TWO).add(dp[i - 1]);
        }

        System.out.printf(String.valueOf(dp[number].mod(BigInteger.valueOf(10007))));
    }
}
