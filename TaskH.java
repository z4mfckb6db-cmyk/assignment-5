import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        if (arr.length%2==0){
            for (int k=0;k<arr.length;k+=2){
                int temp = arr[k];
                arr[k] = arr[k+1];
                arr[k+1] = temp;
            }
        } else {
            for (int j=0;j<arr.length-1;j+=2) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}