package n10871;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/***
 * 문제 번호 : 10871<p>
 * 분류 : 구현
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] array = br.readLine().split(" ");

        int inputCount = Integer.parseInt(st.nextToken());
        int lineNumber = Integer.parseInt(st.nextToken());


        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < inputCount; i++) {
            int i1 = Integer.parseInt(array[i]);

            if (i1 < lineNumber) {
                arrayList.add(i1);
            }
        }

        System.out.println(arrayList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
