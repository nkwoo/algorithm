import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Title : 큰 수 A+B
 * Link : https://www.acmicpc.net/problem/10757
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<BigInteger> inputArray = Arrays.stream(bufferedReader.readLine().split(" ")).map(BigInteger::new).collect(Collectors.toList());

        System.out.println(inputArray.get(0).add(inputArray.get(1)));
    }
}