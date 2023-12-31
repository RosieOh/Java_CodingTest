package sec1;

import java.util.Scanner;

public class java_2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // 선택 정렬 알고리즘
        for(int i=0; i<arr.length - 1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int val : arr) {
            System.out.println(val);
        }
    }
}



/*
int[] arr; // 이미 초기화 되어 있는 배열이라고 가정

for(int i = 0; i < arr.length - 1; i++) {
        for(int j = i + 1; j < arr.length; j++) {

        if(arr[i] > arr[j]) {
        // 값 교환
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        }
        }
        }
 */