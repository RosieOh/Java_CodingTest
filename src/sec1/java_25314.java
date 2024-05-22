package sec1;

import java.util.Scanner;

public class java_25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String string = "";

        scanner.close();

        for(int i = 1; i<=n/4; i++) {
            string += "long ";
        }
        System.out.println(string + "int");
    }
}
