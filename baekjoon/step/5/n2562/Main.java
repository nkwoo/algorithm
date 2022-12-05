package n2562;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Title : 최댓값
 * Link : https://www.acmicpc.net/problem/2562
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = new ArrayList<>();

        for (int count = 0; count < 9; count++) {
            inputList.add(scanner.nextInt());
        }

        int maxValue = inputList.stream().mapToInt(value -> value).max().orElse(0);

        System.out.println(maxValue);
        System.out.println(inputList.indexOf(maxValue) + 1);
    }
}
