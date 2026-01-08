package baaarkingDog.P0x03;

import java.io.*;
import java.util.*;

public class N3273 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());
        int count = 0;
        Arrays.sort(arr);

        int start = 0;
        int end = N - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum == x) {
                count++;
                start++;
                end--;
            } else if (sum > x) {
                end--;
            } else if (sum < x) {
                start++;
            }
        }

        System.out.println(count);
    }
}
