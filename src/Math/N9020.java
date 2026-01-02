package Math;

import java.io.*;

public class N9020 {

    static boolean[] isPrime = new boolean[10001];
    static int r = 2;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        prime();

        while(T > 0 ) {
            int n = Integer.parseInt(br.readLine());
            int a = n / 2;
            int b = n / 2;

            while (true) {
                if (isPrime[a] && isPrime[b]) {
                    System.out.println(a + " " + b);
                    break;
                }

                a--;
                b++;
            }

            T--;
        }
    }

    static void prime() {
        for (int i = 1; i <= 10000; i++) {
            isPrime[i] = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime[i] = false;
                    break;
                }
            }
        }
    }
}
