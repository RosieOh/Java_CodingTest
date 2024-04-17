package sec1;

import java.io.*;

public class java_24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long n = Long.parseLong(br.readLine());
        br.close();

        bw.write(n*(n-1)/2 + "\n" + 2);
        bw.flush();
        bw.close();
    }
}
