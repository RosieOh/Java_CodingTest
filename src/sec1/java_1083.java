package sec1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class java_1083 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());;

        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i<N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int K = Integer.parseInt(bufferedReader.readLine());

        int moveCount = 0, changeIdx=0;
        while (moveCount < K && changeIdx < N-1) {
            int maxNum = arr.get(changeIdx), maxIdx = -1;

            int idx = changeIdx + 1, count = 1;
            while (moveCount + count <= K && idx < N) {
                int num = arr.get(idx);
                if (num > maxNum) {
                    arr.remove(maxIdx);
                    arr.add(changeIdx, maxIdx);
                    moveCount += maxIdx - changeIdx;
                }
                changeIdx++;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i : arr) {
                stringBuilder.append(' ');
            }

            System.out.println(stringBuilder);
            bufferedReader.close();
        }
    }
}
