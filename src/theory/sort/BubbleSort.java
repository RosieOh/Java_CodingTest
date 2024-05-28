package theory.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 버블 정렬 이론
public class BubbleSort {

    // 버블 정렬 메소드 구현
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정렬할 숫자들을 공백으로 구분하여 입력하세요 : ");
        String input = bufferedReader.readLine();

        // 입력한 문자열을 공백 기준으로 나누어 정수 배열로 변환
        String[] ArrayListNumber = input.split(" ");
        int[] arr = new int[ArrayListNumber.length];
        for (int i = 0; i < ArrayListNumber.length; i++) {
            arr[i] = Integer.parseInt(ArrayListNumber[i]);
        }

        System.out.println("정렬 전 배열: " + Arrays.toString(arr));

        // 버블 정렬 수행
        bubbleSort(arr);

        // 정렬 후 배열 출력
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }
}
