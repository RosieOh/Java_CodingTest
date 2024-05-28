package sec1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class java_10814 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {

            /*  String[][] arr = new String[N][2];
                문자열 배열로 인해 문자열인 next()로 받아야함.
             */
            arr[i][0] = scanner.next();
            arr[i][1] = scanner.next();
        }

//        System.out.println("어디까지 왔나 : " + arr);
//        System.out.println("어디까지 왔나2 : " + N);


        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        /*
        첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다
         */

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
