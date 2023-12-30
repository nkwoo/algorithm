package n1475;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * 문제번호 : 1475<p>
 * 분류 : 구현
 */
public class Main {
    public static List<Boolean[]> numberList = new ArrayList<>(Collections.singleton(new Boolean[]{false, false, false, false, false, false, false, false, false, false}));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] roomNumberArray = br.readLine().toCharArray();

        for (char ch : roomNumberArray) {
            int number = ch - 48;

            calcCard(number);
        }

        System.out.println(numberList.size());
    }

    public static void calcCard(int diffNumber) {
        for (Boolean[] array : numberList) {
            if (!array[diffNumber]) {
                array[diffNumber] = true;
                return;
            }

            if ((diffNumber == 6 && !array[9]) || (diffNumber == 9  && !array[6])) {
                calcCard(diffNumber == 6 ? 9 : 6);
                return;
            }
        }

        numberList.add(new Boolean[]{false, false, false, false, false, false, false, false, false, false});
        calcCard(diffNumber);
    }
}
