import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Title : ACM 호텔
 * Link : https://www.acmicpc.net/problem/10250
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCount = Integer.parseInt(bufferedReader.readLine());

        for (int index = 0; index < testCount; index++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());

            int height = Integer.parseInt(tokenizer.nextToken());
            int width = Integer.parseInt(tokenizer.nextToken());
            int number = Integer.parseInt(tokenizer.nextToken());

            int floorNumber = number % height == 0 ? height : number % height;
            int roomNumber = number / height + (number % height == 0 ? 0 : 1);

            System.out.printf("%d%02d\n", floorNumber, roomNumber);
        }
    }
}