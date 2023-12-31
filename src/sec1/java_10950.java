package sec1;

import java.util.Scanner;

public class java_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        int arr[] = new int[c];

        for (int i = 0; i<c; i++) {
            int b = scanner.nextInt();
            int a = scanner.nextInt();
            arr[i] = a + b;
        }

        scanner.close();

        for (int k : arr) {
            System.out.println(k);
        }
    }
}