package n1712;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Title : 손익분기점
 * Link : https://www.acmicpc.net/problem/1712
 * Feedback : 처음 문제를 풀때는 손익분기점까지 계산을 하여
 *            변수를 long으로 두고 계산해서 속도가 1200ms 까지 나왔다.
 *            너무 늦다고 생각하여 곰곰히 생각해보니 순이익을 가지고
 *            계산해도 된다는 생각이 들어 다시 풀게되었다.
 *            조금더 활발하게 머리를 굴려서 문제를 풀어나가야 겠다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int fixCost = inputArray[0];
        int notebookTax = inputArray[1];
        int notebookCost = inputArray[2];

        System.out.println(notebookTax < notebookCost ? (fixCost / (notebookCost - notebookTax)) + 1 : -1);
    }
}
