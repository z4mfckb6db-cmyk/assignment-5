import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] arr= new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        for (int k=0;k<arr.length;k++){
            if (k%2==0) System.out.print(arr[k]+" ");
        }
    }
}