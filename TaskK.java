import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        int cnt = 1;
        for (int k=0;k<arr.length-1;k++){
            if (arr[k]!=arr[k+1]) cnt++;
        }
        System.out.println(cnt);
    }
}