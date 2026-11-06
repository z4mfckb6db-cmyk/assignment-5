import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        int num2 = input.nextInt();
        int nomer = 1;
        for (int k=0;k<arr.length;k++){
            if (arr[k]>=num2) nomer++;
            else break;
        }
        System.out.println(nomer);
    }
}