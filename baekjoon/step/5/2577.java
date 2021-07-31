import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Title : 숫자의 개수
 * Link : https://www.acmicpc.net/problem/2577
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberCount = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        List<Integer> multiplicationList = new ArrayList<>();

        for (int count = 0; count < 3; count++) {
            multiplicationList.add(scanner.nextInt());
        }

        String multiplicationNumberString = multiplicationList.stream().reduce((valueOne, valueTwo) -> valueOne * valueTwo).orElse(0).toString();

        for (int index = 0; index < multiplicationNumberString.length(); index++) {
            numberCount[Integer.parseInt(String.valueOf(multiplicationNumberString.charAt(index)))] += 1;
        }

        Arrays.stream(numberCount).forEach(System.out::println);
    }
}