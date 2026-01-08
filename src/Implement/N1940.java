package Implement;

import java.io.*;
import java.util.*;

public class N1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());


        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int i = 0;
        int j = N - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == M) {
                count++;
                i++;
                j--;
            } else if (sum > M) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println(count);
    }
}

