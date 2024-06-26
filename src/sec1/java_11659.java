package sec1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기 4
public class java_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S_No = Integer.parseInt(st.nextToken());
        int Q_No = Integer.parseInt(st.nextToken());

        long[] S = new long[S_No + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i<=S_No; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        for (int q = 0; q < Q_No; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}
