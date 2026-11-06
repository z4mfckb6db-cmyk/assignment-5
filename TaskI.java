import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int leftValue = arr[0];
        for (int k = 1; k < arr.length;k++) {
            int oldValue = arr[k];
            arr[k] = leftValue;
            leftValue = oldValue;
        }
        arr[0] = leftValue;

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}