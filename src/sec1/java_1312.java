package sec1;

import java.util.Scanner;

public class java_1312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        // 초기값으로 피제수(A)를 제수(B)로 나눈 나머지를 설정
        int total = a % b;

        // 소숫점 아래 N번째 자리까지 계산하는 루프
        for (int i = 0; i < n - 1; i++) {
            // 현재 total을 10배하여 소숫점 이동
            total *= 10;
            // total을 제수(B)로 나눈 나머지를 새로운 total로 설정
            total %= b;
        }

        // 최종적으로 total을 10배하여 소숫점 이동하고 제수(B)로 나눈 몫을 출력
        total *= 10;
        System.out.println(total / b);
    }
}
