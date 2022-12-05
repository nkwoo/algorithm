package n11721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title : 열 개씩 끊어 출력하기
 * Link : https://www.acmicpc.net/problem/11721
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String text = bufferedReader.readLine();

        while (text.length() > 10) {
            System.out.println(text.substring(0, 10));
            text = text.substring(10);
        }

        System.out.println(text);
    }
}
