package sec1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_24265_docu {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        for(int i = 1; i<= n-1; i++) {
            for (int j=i+1; j<=n; j++) {
                count++;
            }
            bufferedReader.close();

            System.out.println(count);
        }
    }
}



//MenOfPassion(A[], n) {
//        sum <- 0;
//        for i <- 1 to n - 1
//        for j <- i + 1 to n
//        sum <- sum + A[i] × A[j]; # 코드1
//        return sum;
//        }
