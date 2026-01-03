package Math;

import java.io.*;
import java.util.StringTokenizer;

public class N17087 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (input > S) {
                arr[i] = input - S;
            } else {
                arr[i] = S - input;
            }
        }

        long result = arr[0];
        for (int i = 1; i < N; i++) {
            result = gcd(result, arr[i]);
        }

        System.out.println(result);
    }

    static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
