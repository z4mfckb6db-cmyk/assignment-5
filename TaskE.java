import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] arr= new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }

        boolean flag = false;
        for (int k=0;k<arr.length-1;k++) {
            if ((arr[k]>0 && arr[k + 1]>0) || (arr[k]<0 && arr[k + 1]<0)) flag = true;
            break;
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}