package theory.재귀;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5)); // 5! = 5 * 4 * 3 * 2 * 1 = 120
    }

    private static int factorial(int n) {
        if (n == 0) { // 기본 케이스
            return 1;
        } else { // 재귀 케이스
            return n * factorial(n - 1);
        }
    }
}
