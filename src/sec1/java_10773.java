package sec1;

import java.util.Scanner;
import java.util.Stack;

public class java_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<Integer>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int number =  sc.nextInt();

            if (number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }

        int sum = 0;

        for(int o : stack) {
            sum += o;
        }

        System.out.println(sum);
    }
}
