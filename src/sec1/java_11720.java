package sec1;

import java.util.Scanner;

public class java_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String snum = sc.next();
        char[] cnum = snum.toCharArray();

        int sum = 0;

        for(int i = 0; i<cnum.length; i++) {
            sum += cnum[i] - '0';
        }

        System.out.println(sum);

    }
}
