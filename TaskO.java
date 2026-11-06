import java.util.Scanner;
import java.util.ArrayList;

public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> balls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            balls.add(scanner.nextInt());
        }
        scanner.close();

        System.out.println(destroyBalls(balls));
    }

    private static int destroyBalls(ArrayList<Integer> balls) {
        int total = 0;
        boolean found;

        do {
            found = false;
            int start = -1, end = -1;

            // Ищем первую цепочку из 3+ одинаковых
            for (int i = 0; i < balls.size() - 2; i++) {
                if (balls.get(i).equals(balls.get(i + 1)) &&
                        balls.get(i).equals(balls.get(i + 2))) {
                    start = i;
                    end = i + 2;
                    while (end + 1 < balls.size() && balls.get(end + 1).equals(balls.get(i))) {
                        end++;
                    }
                    break;
                }
            }

            if (start != -1) {
                int count = end - start + 1;
                total += count;
                found = true;
                for (int j = 0; j < count; j++) {
                    balls.remove(start);
                }
            }
        } while (found);

        return total;
    }
}
