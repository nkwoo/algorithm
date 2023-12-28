package n2490;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/***
 * 문제 번호 : 2490<p>
 * 분류 : 구현
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            String[] array = br.readLine().split(" ");

            long count = Arrays.stream(array).filter("0"::equals).count();

            if (count == 1) {
                System.out.println("A");
            } else if (count == 2) {
                System.out.println("B");
            } else if (count == 3) {
                System.out.println("C");
            } else if (count == 4) {
                System.out.println("D");
            } else if (count == 0) {
                System.out.println("E");
            }
        }
    }
}
