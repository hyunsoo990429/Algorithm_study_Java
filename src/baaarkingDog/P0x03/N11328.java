package baaarkingDog.P0x03;

import java.io.*;
import java.util.*;

public class N11328 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            boolean flag = false;
            int[] arr = new int[26];
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            for (int i = 0; i < a.length(); i++) {
                arr[a.charAt(i) - 'a'] += 1;
            }

            String b = st.nextToken();
            for (int i = 0; i < b.length(); i++) {
                arr[b.charAt(i) - 'a'] -= 1;
            }

            for (int i : arr) {
                if (i != 0) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("Impossible");
            } else {
                System.out.println("Possible");

            }
        }
    }
}
