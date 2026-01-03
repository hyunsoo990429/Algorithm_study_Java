package Math;

import java.io.*;
import java.util.*;

public class N17103 {

    static boolean[] isPrime = new boolean[1000001];
    static int count;

    public static void main(String[] args) throws IOException {
        prime();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0 ) {
            int input = Integer.parseInt(br.readLine());

            int a = 2;
            int b = input - 2;

            while (a <= (input / 2)) {
                if (isPrime[a] && isPrime[b]) {
                    count++;
                }
                a++;
                b--;
            }
            System.out.println(count);
            count = 0;
        }
    }

    static void prime() {
        for (int i = 1; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        isPrime[1] = false;

        for (int i = 2; i * i < isPrime.length; i++) {
            if (!isPrime[i]) {
                continue;
            }

            for (int j = 2; i * j < isPrime.length; j++) {
                isPrime[i * j] = false;
            }
        }
    }
}
