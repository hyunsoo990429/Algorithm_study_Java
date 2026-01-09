package basic.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N10809 {

    static int[] arr = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        Arrays.fill(arr, -1);

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (arr[c - 97] == -1) {
                arr[c - 97] = i;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
