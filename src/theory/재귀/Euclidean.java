package theory.재귀;

public class Euclidean {

    /*
    유클리드 호제법/알고리즘(Euclidean Algorithm) 이란?

    - 두 수의 “최대공약수(GCD)”를 찾기 위한 알고리즘을 의미합니다.
    - 큰 수를 작은 수로 나누어 떨어지게 하여 수를 반복적으로 취하여 나머지 0이 될 때까지 작동하는 방법을 의미합니다.
      그때 작은 수가 최대공약수입니다.
     */
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }
}
