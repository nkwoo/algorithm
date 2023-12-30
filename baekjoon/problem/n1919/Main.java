package n1919;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/***
 * 문제번호 : 1919<p>
 * 분류 : 구현, 문자열
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int removeCharacterCount = 0;

        char[] firstWordArray = br.readLine().toCharArray();
        char[] secondWorkArray = br.readLine().toCharArray();

        int firstWordIndex = 0;
        int secondWordIndex = 0;

        Arrays.sort(firstWordArray);
        Arrays.sort(secondWorkArray);

        while (firstWordIndex < firstWordArray.length || secondWordIndex < secondWorkArray.length) {
            if (firstWordIndex == firstWordArray.length) {
                secondWordIndex++;
                removeCharacterCount++;
                continue;
            } else if (secondWordIndex == secondWorkArray.length) {
                firstWordIndex++;
                removeCharacterCount++;
                continue;
            }

            if (firstWordArray[firstWordIndex] < secondWorkArray[secondWordIndex]) {
                firstWordIndex++;
                removeCharacterCount++;
            } else if (firstWordArray[firstWordIndex] > secondWorkArray[secondWordIndex]) {
                secondWordIndex++;
                removeCharacterCount++;
            } else {
                firstWordIndex++;
                secondWordIndex++;
            }
        }

        System.out.println(removeCharacterCount);
    }
}
