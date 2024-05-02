package sec1;

import java.util.Scanner;

public class java_10817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        scanner.close();

        for (int i=0; i<arr.length-1; i++) {
            for(int k = i+1; k<arr.length; k++) {
                if(arr[i]>arr[k]) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        System.out.println(arr[1]);
    }
}
