package n2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * Title : 부녀회장이 될테야
 * Link : https://www.acmicpc.net/problem/2775
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCount = Integer.parseInt(bufferedReader.readLine());

        for (int index = 0; index < testCount; index++) {
            int floor = Integer.parseInt(bufferedReader.readLine());
            int room = Integer.parseInt(bufferedReader.readLine());

            int[] roomArray = IntStream.range(0, room).map(operand -> operand + 1).toArray();

            for (int floorIndex = 1; floorIndex <= floor; floorIndex++) {
                for (int roomIndex = 1; roomIndex < roomArray.length; roomIndex++) {
                    roomArray[roomIndex] = roomArray[roomIndex - 1] + roomArray[roomIndex];
                }
            }

            System.out.println(roomArray[room - 1]);
        }
    }
}
