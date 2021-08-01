import java.util.Scanner;

/**
 * Title : 숫자의 합
 * Link : https://www.acmicpc.net/problem/11720
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.nextLine());

        String numberString = scanner.nextLine();

        if (numberCount == numberString.length()) {
            System.out.println(numberString.chars().map(Character::getNumericValue).reduce(Integer::sum).orElse(0));
        }
    }
}