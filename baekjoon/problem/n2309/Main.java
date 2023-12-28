package n2309;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/***
 * 문제 번호 : 2309<p>
 * 분류 : 브루트포스 알고리즘, 정렬
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int incorrectFirstNumber = 0;
        int incorrectSecondNumber = 0;
        int sumNumber = 0;

        int[] array = new int[9];
        int[] sortedArray = new int[7];

        for (int i = 0; i < 9; i++) {
            int number = Integer.parseInt(br.readLine());

            array[i] = number;

            sumNumber += number;
        }

        for (int j = 0; j < 9 && incorrectFirstNumber == 0; j++) {
            for (int k = 0; k < 9 && j != k; k++) {
                if (sumNumber - array[j] - array[k] == 100) {
                    incorrectFirstNumber = array[j];
                    incorrectSecondNumber = array[k];
                    break;
                }
            }
        }

        int sortedArrayIndex = 0;

        for (int i = 0; i < 9; i++) {
            if (array[i] == incorrectFirstNumber || array[i] == incorrectSecondNumber) continue;

            sortedArray[sortedArrayIndex++] = array[i];
        }

        Arrays.sort(sortedArray);

        Arrays.stream(sortedArray).forEach(System.out::println);
    }
}
