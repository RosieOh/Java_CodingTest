package theory.재귀;

public class Fibonacci {

    /*
    - 이전 두 항의 합이 다음 항이 되는 수열을 의미합니다.
    즉, 첫째 항과 둘째 항이 1이고 이후 모든 항은 모든 항은 바로 앞 두항의 합으로 이루어지는 수열을 의미합니다.

    - 피보나치 수열의 예로는 [1, 1, 2, 3, 5, 8, 13, 21, 34,...]과 같은 형태로 구성이 됩니다.

     */
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
