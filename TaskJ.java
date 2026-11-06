import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i=0; i< arr.length;i++){
            arr[i] = input.nextInt();
        }
        int mx = arr[0];
        for (int k=1;k<arr.length;k++){
            if (mx<arr[k]) mx = arr[k];
        }
        System.out.println(mx);
    }
}