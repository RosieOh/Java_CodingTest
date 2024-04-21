package theory;

import java.util.Scanner;

public class JudgeABC1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요.: ");
        int n = scanner.nextInt();

        if(n == 1)
            System.out.println("A");
        else if (n == 2)
            System.out.println("B");
        else
            System.out.println("C");
    }
}
