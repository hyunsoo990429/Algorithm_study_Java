package basic.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int result1 = A * (B % 10);
        System.out.println(result1);

        int result2 = A * ((B % 100) / 10);
        System.out.println(result2);

        int result3 = A * (B / 100);
        System.out.println(result3);

        System.out.println(result1 + result2 * 10 + result3 * 100);
    }
}
