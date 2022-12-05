package n15596;

/**
 * Title : 정수 N개의 합
 * Link : https://www.acmicpc.net/problem/15596
 */
public class Test {
    long sum(int[] a) {
        long ans = 0;

        for (int index : a) {
            ans += index;
        }

        return ans;
    }
}
