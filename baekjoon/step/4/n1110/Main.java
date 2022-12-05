package n1110;

import java.util.Scanner;

/**
 * Title : 더하기 사이클
 * Link : https://www.acmicpc.net/problem/1110
 *
 * 내가 왜 이렇게 Heavy하게 만들었을까... (충고로 삼기 위해 수정하지 않았습니다.)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mainNumber = scanner.nextInt();

        Cycle cycle = new Cycle(mainNumber);

        System.out.println(cycle.getCount());
    }
}
class Cycle {
    private final int originalValue;
    private int cycleValue;
    private int count = 0;

    public Cycle(int originalValue) {
        this.originalValue = originalValue;
        this.cycleValue = originalValue;
    }

    public int getCount() {
        if (this.originalValue != this.cycleValue || this.count == 0) {

            this.count += 1;
            this.cycleValue = (getNumberByUnits(this.cycleValue) * 10) + getNumberByUnits(getNumberByTens(this.cycleValue) + getNumberByUnits(this.cycleValue));

            return getCount();
        } else {
            return this.count;
        }
    }

    private int getNumberByUnits(int value) {
        return (value < 10) ? value : value % 10;
    }

    private int getNumberByTens(int value) {
        return (value < 10) ? 0 : value / 10;
    }
}
