package n1193;

import java.util.Scanner;

/**
 * Title : 분수찾기
 * Link : https://www.acmicpc.net/problem/1193
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fractionFindNumber = Integer.parseInt(scanner.nextLine());

        int whileCount = 1;

        while (fractionFindNumber > whileCount) {
            fractionFindNumber -= whileCount++;
        }

        int numerator = whileCount % 2 == 0 ? fractionFindNumber : whileCount - (fractionFindNumber - 1);
        int denominator = whileCount % 2 == 0 ? whileCount - (fractionFindNumber - 1) : fractionFindNumber;

        System.out.println(numerator + "/" + denominator);
    }
}
