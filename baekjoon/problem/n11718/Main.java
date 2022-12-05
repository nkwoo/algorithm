package n11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title : 그대로 출력하기
 * Link : https://www.acmicpc.net/problem/11718
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String text;
        while ((text = bufferedReader.readLine()) != null) {
            System.out.println(text.replaceAll("[^0-9A-Za-z\\s]+", "").trim());
        }
    }
}
