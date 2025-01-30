package sec1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class java_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] listQueuestack = new int[n];
        int[] currentList = new int[n];

        StringBuilder sb = new StringBuilder();

        StringTokenizer input1 = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            listQueuestack[i] = Integer.parseInt(input1.nextToken());
        }

        StringTokenizer input2 = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            currentList[i] = Integer.parseInt(input2.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] insertList = new int[m];

        StringTokenizer input3 = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            insertList[i] = Integer.parseInt(input3.nextToken());
        }

        // 데크 구현
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=0; i<n; i++) {
            if (listQueuestack[i] == 0) {
                deque.addFirst(currentList[i]);
            }
        }
        for (int i=0; i<m; i++) {
            deque.add(insertList[i]);
            sb.append((deque.pollFirst() + " "));
        }

        System.out.println(sb);
        br.close();
    }
}
