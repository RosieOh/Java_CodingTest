package sec1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(bufferedReader.readLine());
        bufferedReader.close();
        System.out.println(n*n);
        System.out.println(1);
    }
}
