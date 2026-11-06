import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }

        for (int k=a;k<b;k++) {
            int tmp = arr[k-1];
            arr[k-1] = arr[b-1];
            arr[b-1] = tmp;
            b--;
        }
        for (int j=c;j<d;j++) {
            int tmp = arr[j-1];
            arr[j-1] = arr[d-1];
            arr[d-1] = tmp;
            d--;
        }
        for (int x:arr){
            System.out.print(x + " ");
        }
    }
}