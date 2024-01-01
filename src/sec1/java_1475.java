package sec1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_1475 {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 표준 입력(System.in)에서 데이터를 읽어옴
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 사용자로부터 숫자로 이루어진 문자열을 입력받음
        String s = bufferedReader.readLine();

        // 각 숫자의 빈도를 저장할 배열 초기화
        int[] arr = new int[10];

        // 입력받은 문자열을 순회하면서 각 숫자의 빈도를 계산
        for (int i = 0; i < s.length(); i++) {
            // 현재 문자를 숫자로 변환
            int num = Character.getNumericValue(s.charAt(i));

            // 변환된 숫자에 따라 빈도 배열 갱신
            if (num == 0) {
                arr[9]++;
            } else {
                arr[num]++;
            }
        }

        // 가장 높은 빈도를 찾기 위한 변수 초기화
        int max = 0;

        // 0부터 8까지의 숫자에 대해 가장 높은 빈도 찾기
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }

        // 숫자 9는 두 번 사용할 수 있으므로 빈도를 2로 나누고, 홀수일 경우 하나를 더 추가
        int nine = arr[9] / 2;
        if (arr[9] % 2 == 1) nine++;

        // 현재까지의 최대 빈도와 숫자 9의 빈도 비교하여 더 큰 값 선택
        max = Math.max(max, nine);

        // 최종적으로 출력
        System.out.print(max);
    }
}
