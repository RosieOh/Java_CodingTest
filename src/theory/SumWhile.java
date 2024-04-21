package theory;

import java.util.Scanner;

// while문으로 1, 2, ..., n의 합을 구함
public class SumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i<=n) {
            sum += i;
            i++;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
