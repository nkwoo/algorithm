import java.util.Scanner;

/**
 * Title : 벌집
 * Link : https://www.acmicpc.net/problem/2292
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int honeyCount = Integer.parseInt(scanner.nextLine());

        int depth = 1;
        int incrementNumber = 1;

        while (!(incrementNumber - (6 * (depth - 1) > 0 ? (6 * (depth - 1)) + 1 : 0) <= honeyCount && honeyCount <= incrementNumber)) {
            incrementNumber += 6 * depth;
            depth++;
        }

        System.out.println(depth);
    }
}