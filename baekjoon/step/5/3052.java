import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Title : 나머지
 * Link : https://www.acmicpc.net/problem/3052
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> remainList = new ArrayList<>();

        for (int count = 0; count < 10; count++) {
            int number = scanner.nextInt();

            remainList.add(number % 42);
        }

        System.out.println(remainList.stream().distinct().count());
    }
}