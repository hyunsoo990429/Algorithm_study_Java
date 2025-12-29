package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        String S = br.readLine();
        for (int i = 0; i < N; i++) {
            int input = S.charAt(i) - '0';
            sum += input;
        }

        System.out.println(sum);
    }
}
