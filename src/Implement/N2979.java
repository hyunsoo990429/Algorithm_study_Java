package Implement;

import java.io.*;
import java.util.*;

public class N2979 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = new int[101];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = a; j < b; j++) {
                arr[j] += 1;
            }
        }

        for (int i : arr) {
            if (i == 3) {
                sum += i * C;
            } else if (i == 2) {
                sum += i * B;
            } else {
                sum += i * A;
            }
        }

        System.out.println(sum);
    }
}
