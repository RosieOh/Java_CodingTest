package sec1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class java_2751 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();

        int N = scanner.nextInt();

        ArrayList<Integer> List = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            List.add(scanner.nextInt());
        }

        Collections.sort(List);

        for (int arr : List) {
            stringBuffer.append(arr).append('\n');
        }

        System.out.println(stringBuffer);
    }
}

