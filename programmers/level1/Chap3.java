package level1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Chap3 {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})).mapToObj(String::valueOf).collect(Collectors.joining(",")));
        System.out.println(Arrays.stream(solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})).mapToObj(String::valueOf).collect(Collectors.joining(",")));
    }

//    초기버전
//    public static int[] solution(int k, int[] score) {
//        List<Integer> list = new ArrayList<>();
//        List<Integer> answer = new ArrayList<>();
//
//        for (int point : score) {
//            list.add(point);
//            list.sort((o1, o2) -> o2 - o1);
//            if (list.size() > k) {
//                list.remove(list.size() - 1);
//            }
//
//            answer.add(list.get(list.size() - 1));
//        }
//
//        return answer.stream().mapToInt(i -> i).toArray();
//    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            queue.add(score[i]);

            if (queue.size() > k) {
                queue.poll();
            }

            answer[i] = queue.size() > 0 ? queue.peek() : score[i];
        }
        return answer;
    }
}