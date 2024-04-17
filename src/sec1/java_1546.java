package sec1;

import java.util.Scanner;

public class java_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int A[] = new int[n];

        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i<n; i++) {
            if (A[i] > max) max = A[i];
            sum = sum + A[i];
        }

        System.out.println(sum * 100 / max / n);
    }
}
