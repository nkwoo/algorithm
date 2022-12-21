package level1;

public class Chap4 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3, 2));
        System.out.println(solution(5, 3, 2));
        System.out.println(solution(100000, 100, 100));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int knight = 1; knight <= number; knight++) {
            int count = 0;

            for (int j = 1; j * j <= knight; j++) {
                if (j * j == knight) {
                    count += 1;
                } else if (knight % j == 0) {
                    count += 2;
                }
            }

            if (count > limit) {
                count = power;
            }

            answer += count;
        }

        return answer;
    }
}