import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.Arrays;

/**
 * Title : 오븐 시계
 * Link : https://www.acmicpc.net/problem/2525
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(bufferedReader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

        int totalMinutes = array[0] * 60 + array[1];

        int cookingMinutes = Integer.parseInt(bufferedReader.readLine().trim());

        totalMinutes += cookingMinutes;


        if (totalMinutes >= 60 * 24) {
            totalMinutes -= 60 * 24;
        }

        System.out.println(totalMinutes / 60 + " " + totalMinutes % 60);
    }
}
