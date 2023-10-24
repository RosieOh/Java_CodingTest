package sec1;
import java.util.Scanner;

public class java_2525 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 시
        int B = sc.nextInt(); // 분
        int C = sc.nextInt(); // 요리하는데 필요한 시간(분 단위)
        sc.close();

        int total = 60 * A + B + C; // 총 시간을 분으로 바꾸기

        // 24시간 넘어가면 0시간 0분으로 리셋하기
        if (total >= 1440) {
            total -= 1440;
        }

        A = total / 60;
        B = total % 60;
        System.out.println(A + " " + B);
    }
}
