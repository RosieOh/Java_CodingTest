package sec1;

import java.util.Arrays;
import java.util.Scanner;

public class java_25305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int k = scanner.nextInt();

        int arr2[] = new int[N];

        for(int i = 0; i< N; i++){
            arr2[i] = scanner.nextInt();
        }

        Arrays.sort(arr2);

        System.out.println(arr2[N-k]);
    }
}
