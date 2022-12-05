package n2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Title : 주사위 세개
 * Link : https://www.acmicpc.net/problem/2480
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> diceMap = new HashMap<>();

        AtomicInteger maxNumber = new AtomicInteger(0);

        Arrays.stream(bufferedReader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).forEach(dice -> {
            diceMap.merge(dice, 1, Integer::sum);
            if (maxNumber.get() < dice) maxNumber.set(dice);
        });

        int sameKey = 0;
        int sameValue = 0;

        for (Map.Entry<Integer, Integer> entry : diceMap.entrySet()) {
            if (sameValue < entry.getValue()) {
                sameKey = entry.getKey();
                sameValue = entry.getValue();
            }
        }

        if (sameValue == 3) {
            System.out.println(10000 + sameKey * 1000);
        } else if (sameValue == 2) {
            System.out.println(1000 + sameKey * 100);
        } else {
            System.out.println(maxNumber.get() * 100);
        }
    }
}
