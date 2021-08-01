import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Title : 한수
 * Link : https://www.acmicpc.net/problem/1065
 * Feedback : 다른 사람들의 풀이를 보니 1000이라는 제한수를 두고 간소화 하게 짠 부분이 있다.
 *            그부분에 대해서 미쳐 고려하지 않고 변수는 무한적이라는 바탕하에 하단과 같이 코드를 짜게되었다.
 *            그리고 무군별한 Class 사용도 문제가 있어 보인다.
 *            앞으로는 문제에서 제시한 제한 사항을 꼼꼼히 읽고 최적화된 코드를 짜야겠다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int hanCount = 0;

        for (int index = 1; index <= x; index++) {
            if (index < 100) {
                hanCount++;
            } else {
                UnitManager unitManager = new UnitManager(index);

                if (unitManager.isArithmeticSequence()) {
                    hanCount++;
                }
            }
        }

        System.out.println(hanCount);
    }
}
class UnitManager {
    private final List<Integer> unitList = new ArrayList<>();

    private int getUnitNumber(int number) {
        if (number / 10 > 0) {
            this.unitList.add(number % 10);
            return getUnitNumber(number / 10);
        } else {
            this.unitList.add(number);
            return 0;
        }
    }

    public boolean isArithmeticSequence() {
        int diffStack = 0, commonDiff = 0;

        for (int index = 0; index < this.unitList.size(); index++) {
            if (!(index + 1 > this.unitList.size() - 1)) {
                if (diffStack == 0) {
                    commonDiff = this.unitList.get(index + 1) - this.unitList.get(index);
                    diffStack++;
                } else {
                    if (this.unitList.get(index + 1) - this.unitList.get(index) == commonDiff) {
                        diffStack++;
                    }
                }
            }
        }

        return diffStack == this.unitList.size() - 1;
    }

    public UnitManager(int number) {
        getUnitNumber(number);
        Collections.reverse(this.unitList);
    }
}