package sec1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_1517 {
    // 문자열을 정수로 변환하는 메서드
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    // 교환 횟수를 저장할 변수
    static long swapCount = 0;
    // 정렬된 배열을 저장할 배열
    static long[] sorted;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력 받기
        int n = stoi(bf.readLine()); // 배열 크기
        sorted =  new long[n]; // 정렬된 배열을 저장할 배열 생성
        long[] arr = new long[n]; // 입력된 배열

        // 입력된 배열 초기화
        st = new StringTokenizer(bf.readLine());
        for (int i=0; i<n; i++)
            arr[i] = stoi(st.nextToken());

        // 합병 정렬 호출
        mergeSort(arr, 0, n-1);
        // 결과 출력
        System.out.println(swapCount);
    }

    // 합병 정렬
    static void mergeSort(long[] arr, int low, int high) {
        if(low < high) {
            int mid = (low+high)/2; // 중간 인덱스 계산
            mergeSort(arr, low, mid); // 왼쪽 부분 배열 정렬
            mergeSort(arr, mid+1, high); // 오른쪽 부분 배열 정렬
            merge(arr, low, mid, high); // 정렬된 부분 배열 합병
        }
    }

    // 정렬된 두 부분 배열을 합병하는 메서드
    static void merge(long[] arr, int low, int mid ,int high) {
        int i = low; // 왼쪽 부분 배열의 시작 인덱스
        int j = mid + 1; // 오른쪽 부분 배열의 시작 인덱스
        int index = low; // 합병한 배열에 대한 인덱스

        // 두 부분 배열 중 작은 값을 순서대로 합병 배열에 저장
        while (i <= mid && j <= high) {
            if(arr[i] <= arr[j]) // 왼쪽 부분 배열의 값이 작은 경우
                sorted[index++] = arr[i++]; // 작은 값을 합병 배열에 저장하고 왼쪽 인덱스 증가
            else {
                sorted[index++] = arr[j++]; // 오른쪽 부분 배열의 값이 작은 경우
                swapCount += (mid + 1 - i); // 왼쪽 부분 배열의 남아 있는 값들의 개수만큼 교환 횟수 증가
            }
        }

        // 남아 있는 값들을 합병 배열에 저장
        while (i <= mid)
            sorted[index++] = arr[i++];
        while (j <= high)
            sorted[index++] = arr[j++];

        // 합병한 배열을 원본 배열에 복사
        for(int k=low; k<=high; k++)
            arr[k] = sorted[k];
    }
}

/*
여기서 사용된 주요 알고리즘은 "합병 정렬(Merge Sort)"입니다. 이 알고리즘은 분할 정복(divide and conquer) 방법을 사용하여 배열을 정렬합니다. 주요 특징은 다음과 같습니다:

분할(Divide): 배열을 반으로 나눕니다. 이 과정에서 배열의 중간 지점을 찾습니다.
정복(Conquer): 나눠진 배열을 각각 재귀적으로 정렬합니다. 재귀 호출을 통해 배열의 크기가 1이 될 때까지 분할합니다.
합병(Merge): 정렬된 배열을 합병하여 하나의 정렬된 배열로 만듭니다. 이때, 두 개의 정렬된 배열을 합치면서 정렬된 순서를 유지합니다.
위 코드에서 mergeSort 함수는 주어진 배열을 반으로 나누고 각 부분 배열을 재귀적으로 정렬하는 역할을 합니다. merge 함수는 정렬된 두 부분 배열을 합병하여 하나의 정렬된 배열을 만들며,
이 과정에서 교환 횟수를 계산합니다.

또한, 코드에서 사용된 swapCount 변수는 합병 과정에서 발생하는 역순의 쌍을 카운트하여 교환 횟수를 계산하는 데 사용됩니다.
이것은 정렬 과정에서 역순으로 배열되어 있는 원소들을 정렬하는 데 필요한 최소한의 교환 횟수를 나타냅니다.
 */