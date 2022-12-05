package n4673;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Title : 셀프 넘버
 * Link : https://www.acmicpc.net/problem/4673
 */
public class Main {
    public static int getUnitNumber(int number) {
        return number / 10 > 0 ? getUnitNumber(number / 10) + (number % 10) : number;
    }

    public static void main(String[] args) {
        List<Integer> notSelfNumberList = new ArrayList<>();

        for (int index = 1; index <= 10000; index++) {
            notSelfNumberList.add(index + getUnitNumber(index));
        }

        notSelfNumberList = notSelfNumberList.stream().distinct().collect(Collectors.toList());

        for (int index = 1; index <= 10000; index++) {
            if (!notSelfNumberList.contains(index)) {
                System.out.println(index);
            }
        }
    }
}
