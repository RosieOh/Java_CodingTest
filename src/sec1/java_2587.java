package sec1;

import java.util.Arrays;
import java.util.Scanner;

public class java_2587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[5];
        int sum = 0;

        for(int i=0; i<5; i++) {
            int n = scanner.nextInt();
            arr[i] = n;
            sum += n;
        }

        System.out.println(sum / 5);
        Arrays.sort(arr);
        System.out.println(arr[2]);

        scanner.close();
    }
}
