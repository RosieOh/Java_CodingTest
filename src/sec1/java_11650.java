package sec1;

import java.util.Arrays;
import java.util.Scanner;

public class java_11650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] arr = new int [N][2];

        for(int i=0; i<N; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        Arrays.sort(arr, (arr1, arr2) -> {
                    if (arr1[0] == arr2[0]) {
                        return arr1[1] - arr2[1];
                    } else {
                        return arr1[0] - arr2[0];
                    }
                }
        );


        for(int i=0; i<N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
