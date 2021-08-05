import java.util.*;

/**
 * Title : 그룹 단어 체커
 * Link : https://www.acmicpc.net/problem/1316
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());

        int consecutiveNumberCount = 0;

        for (int index = 0; index < inputCount; index++) {
            String s = scanner.nextLine();

            HashMap<Character, Integer> charCountMap = new HashMap<>();

            char beforeWord = 0;

            char[] words = s.toCharArray();

            for (char word: words) {
                if (beforeWord == 0) beforeWord = word;

                charCountMap.put(word, charCountMap.get(word) != null ? (beforeWord == word ? charCountMap.get(word) + 1 : 1) : 1);

                beforeWord = word;
            }

            if (charCountMap.values().stream().reduce(Integer::sum).orElse(0) == words.length) {
                consecutiveNumberCount++;
            }
        }

        System.out.println(consecutiveNumberCount);
    }
}