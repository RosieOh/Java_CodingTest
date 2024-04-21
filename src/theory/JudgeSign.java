package theory;

import java.util.Scanner;

// 조건 판단과 분기
// 입력한 정숫값의 부호(양수/음수/0)를 판단
public class JudgeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요.: ");
        int n = scanner.nextInt();

        if(n>0)
            System.out.println("이 수는 0입니다.");
    }
}
