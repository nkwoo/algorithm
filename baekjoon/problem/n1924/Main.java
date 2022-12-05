package n1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;

/**
 * Title : 2007년
 * Link : https://www.acmicpc.net/problem/1924
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String[] days = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        LocalDate startDate = LocalDate.of(2007, array[0], array[1]);

        System.out.println(days[startDate.getDayOfWeek().getValue() - 1]);
    }
}


