import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Title : 알파벳 찾기
 * Link : https://www.acmicpc.net/problem/10809
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        int[] lowerLetters = new int[26];

        Arrays.fill(lowerLetters, -1);

        char[] inputWords = inputString.toCharArray();

        for (int index = 0; index < inputWords.length; index++) {
            if (lowerLetters[inputWords[index] - 97] == -1) {
                lowerLetters[inputWords[index] - 97] = index;
            }
        }

        System.out.println(Arrays.stream(lowerLetters).mapToObj(Integer::toString).collect(Collectors.joining(" ")));
    }
}