package n14681;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Title : 사분면 고르기
 * Link : https://www.acmicpc.net/problem/14681
 */
public class Main {
    public static String getPosByQuadrant(int xPos, int yPos) {
        return 1 <= xPos ? (1 <= yPos ? "1" : "4") : (1 <= yPos ? "2" : "3");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int xPos = scanner.nextInt();
            int yPos = scanner.nextInt();

            List<Integer> posList = Stream.of(xPos, yPos).filter(pos -> -1000 <= pos && pos <= 1000 && pos != 0).collect(Collectors.toList());

            if (posList.size() != 2)
                throw new RuntimeException("x,y 좌표는 -1000 보다 크며 1000 보다 작야아하고 0이면 안됩니다.");

            System.out.println(getPosByQuadrant(xPos, yPos));
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
