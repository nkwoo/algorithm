import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Title : 단어 공부
 * Link : https://www.acmicpc.net/problem/1157
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] words = scanner.nextLine().toLowerCase().toCharArray();

        HashMap<Character, Integer> wordCountList = new HashMap<>();

        for (char word: words) {
            wordCountList.put(word, wordCountList.get(word) != null ? wordCountList.get(word) + 1 : 1);
        }

        char maxAlphabet = '?';
        int maxAlphabetCount = 0;

        for (Map.Entry<Character, Integer> entry: wordCountList.entrySet()) {
            if (maxAlphabetCount <= entry.getValue()) {
                maxAlphabet = entry.getValue() == maxAlphabetCount ? '?' : entry.getKey();
                maxAlphabetCount = entry.getValue();
            }
        }

        System.out.println(String.valueOf(maxAlphabet).toUpperCase());
    }
}