import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        int len = arr.length;
        for (int k=0;k<arr.length/2;k++){
            int temp = arr[k];
            arr[k] = arr[len-1];
            arr[len-1] = temp;
            len--;
        }
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}