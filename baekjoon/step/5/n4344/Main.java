package n4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Title : 평균은 넘겠지
 * Link : https://www.acmicpc.net/problem/4344
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Double> averageRatioList =  new ArrayList<>();

        int caseCount = Integer.parseInt(bufferedReader.readLine());

        for (int index = 0; index < caseCount; index++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());

            List<Integer> scoreArray = new ArrayList<>();

            int scoreCount = 0;

            if (tokenizer.hasMoreTokens()) {
                scoreCount = Integer.parseInt(tokenizer.nextToken());
            }

            while (tokenizer.hasMoreTokens()) {
                scoreArray.add(Integer.parseInt(tokenizer.nextToken()));
            }

            if (scoreArray.size() == scoreCount) {
                AtomicReference<Double> averageScoreAtomic = new AtomicReference<>();

                averageScoreAtomic.set(scoreArray.stream().mapToInt(value -> value).average().orElse(0.0));

                long averageMoreCount = scoreArray.stream().filter(value -> (double) value > averageScoreAtomic.get()).count();

                averageRatioList.add((double) averageMoreCount / scoreCount * 100);
            }
        }

        averageRatioList.forEach(avg -> System.out.println(String.format("%.3f", avg) + "%"));
    }
}
