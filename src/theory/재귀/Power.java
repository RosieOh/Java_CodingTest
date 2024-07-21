package theory.재귀;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 5)); // 15
    }

    // 파라미터로 base 밑과 exponent 지수를 인자로 받아서 거듭제곱을 수행하는 함수
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
