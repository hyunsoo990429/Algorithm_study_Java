package Implement;

import java.io.*;
import java.util.*;

public class N2559 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        int best = sum;

        for (int i = K; i < N; i++) {
            sum += arr[i] - arr[i - K];
            best = Math.max(best, sum);
        }

        System.out.println(best);
    }
}
