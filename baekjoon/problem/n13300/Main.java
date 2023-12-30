package n13300;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

/***
 * 문제번호 : 13300<p>
 * 분류 : 수학, 구현
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer[]> map = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        AtomicInteger roomCount = new AtomicInteger();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int maxRoomUserCount = Integer.parseInt(st.nextToken());

        for (int i = 0; i < count; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st2.nextToken());
            int grade = Integer.parseInt(st2.nextToken());

            Integer[] integers = map.get(grade);

            if (integers == null) {
                Integer[] array = new Integer[]{0,0};

                array[gender] += 1;

                map.put(grade, array);
            } else {
                integers[gender] += 1;
            }
        }

        map.values().forEach(integers -> {
            roomCount.addAndGet((integers[0] / maxRoomUserCount) + (integers[0] % maxRoomUserCount > 0 ? 1 : 0) + (integers[1] / maxRoomUserCount) + (integers[1] % maxRoomUserCount > 0 ? 1 : 0));
        });

        System.out.println(roomCount.get());
    }
}
