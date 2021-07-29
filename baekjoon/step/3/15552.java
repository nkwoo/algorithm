import java.io.*;
import java.util.StringTokenizer;

/**
 * Title : 빠른 A + B
 * Link : https://www.acmicpc.net/problem/15552
 */
public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputCount = Integer.parseInt(reader.readLine());

        for (int count = 0; count < inputCount; count++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            writer.write(String.valueOf(Integer.parseInt(tokenizer.nextToken()) + Integer.parseInt(tokenizer.nextToken())));
            writer.newLine();
        }

        writer.flush();

        reader.close();
        writer.close();
    }
}