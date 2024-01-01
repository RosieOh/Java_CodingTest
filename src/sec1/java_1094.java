package sec1;

import java.util.Scanner;

public class java_1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        int stick = 64; // 처음 막대의 크기
        int count = 0;  //

        while (X > 0) {
            if(stick > X) {
                stick /= 2;
            } else {
                X -= stick;
                count++;
            }
        }
        System.out.println(count);
    }
}
