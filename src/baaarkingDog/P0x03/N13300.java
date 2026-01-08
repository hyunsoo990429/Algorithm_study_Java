package baaarkingDog.P0x03;

import java.io.*;
import java.util.*;

public class N13300 {

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[7][3];
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            arr[Y][S] += 1;
        }

        for (int[] ints : arr) {
            for (int i : ints) {
                if (i % K == 0) {
                    count += (i / K);
                } else {
                    count += (i / K) + 1;
                }
            }
        }

        System.out.println(count);
    }
}
