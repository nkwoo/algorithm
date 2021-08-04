import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Title : 크로아티아 알파벳
 * Link : https://www.acmicpc.net/problem/2941
 */
public class Main {
    public static final List<String> CROATIA_WORD = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (String croatia: CROATIA_WORD) {
            input = input.replaceAll(croatia, "\\\\");
        }

        System.out.println(input.toCharArray().length);
    }
}