package sec1;

import java.util.Scanner;

public class java_10813 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int arr[] = new int[N];
        int M = scanner.nextInt();
        int temp;

        for (int i = 0; i<arr.length;  i++) {
            arr[i] = i + 1;
        }

        for(int j = 0; j<M; j++) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }

        for(int k = 0; k<arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
