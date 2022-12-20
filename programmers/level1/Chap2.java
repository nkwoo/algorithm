package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chap2 {
    public static void main(String[] args) {
        System.out.println(solution("aaabbaccccabba"));
        System.out.println(solution("banana"));
        System.out.println(solution("abracadabra"));
    }

    public static int solution(String s) {
        char[] chars = s.toCharArray();

        Character firstWord = null;

        int answer = 0;

        int sameCount = 0;
        int differentCount = 0;


        for (char word : chars) {
            if (firstWord == null) firstWord = word;

            if (firstWord == word) {
                sameCount++;
            } else {
                differentCount++;
            }

            if (sameCount == differentCount) {
                answer++;
                sameCount = differentCount = 0;
                firstWord = null;
            }
        }

        if (firstWord != null) {
            answer++;
        }

        return answer;
    }
}



