import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Title : 평균
 * Link : https://www.acmicpc.net/problem/1546
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> examList = new ArrayList<>();

        double totalNewExamScore = 0.0;

        int examCount = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        while (tokenizer.hasMoreTokens()) {
            examList.add(Integer.parseInt(tokenizer.nextToken()));
        }

        if (examList.size() == examCount) {
            int maxExamScore = examList.stream().mapToInt(value -> value).max().orElse(0);

            for (int examScore : examList) {
                totalNewExamScore += (double) examScore / maxExamScore * 100;
            }
        }

        System.out.printf("%f", totalNewExamScore / examCount);

        reader.close();
    }
}