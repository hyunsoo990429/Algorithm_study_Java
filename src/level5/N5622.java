package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5622 {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        int sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        for (int i = 0; i < S.length(); i++) {
            int a = arr[S.charAt(i) - 'A'];
            sum += a;
        }

        System.out.println(sum);
    }
}
