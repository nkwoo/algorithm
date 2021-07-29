import java.util.Scanner;

/**
 * Title : A + B - 4
 * Link : https://www.acmicpc.net/problem/10951
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();

            System.out.println(firstNumber + secondNumber);
        }
    }
}