package n2446;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_OLD {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());

        int turnFlag = 1;

        for (int i = 1; i < count * 2 - 1; i += turnFlag) {
            if (i == 0) break;

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = (count - i) * 2; j >= 0; j--) {
                System.out.print("*");
            }

            System.out.print("\n");

            if (i == count) turnFlag = -1;
        }
    }
}
