package n2884;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Title : 알람 시계
 * Link : https://www.acmicpc.net/problem/2884
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int hour = scanner.nextInt();
            int minute = scanner.nextInt();

            if (!(0 <= hour && hour <= 23))
                throw new RuntimeException("시간은 0부터 23까지 입력가능 합니다.");

            if (!(0 <= minute && minute <= 59))
                throw new RuntimeException("분 0부터 59까지 입력가능 합니다.");

            int totalMinute = hour * 60 + minute;

            int alarmTotalMinute = totalMinute - 45 < 0 ? 1440 + totalMinute - 45 : totalMinute - 45;

            System.out.println(alarmTotalMinute / 60 + " " + alarmTotalMinute % 60);
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
