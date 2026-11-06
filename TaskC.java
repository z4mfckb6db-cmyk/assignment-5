import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] arr= new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }

        int cnt = 0;
        for (int k=0;k<arr.length;k++){
            if (arr[k]>0) cnt++;
        }
        System.out.print(cnt);
    }
}
