package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N6588 {

    static boolean[] isPrime = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //prime();
        primeWithAlgo();
        String input;

        while (!(input = br.readLine()).equals("0")){
            int n = Integer.parseInt(input);

            int a = 3;
            int b = n - 3;

            while (true) {

                if (isPrime[a] && isPrime[b]) {
                    System.out.println(n + " = " + a + " + " + b);
                    break;
                }

                a += 2;
                b -= 2;
            }
        }
    }

    static void prime() {
        for (int i = 1; i < isPrime.length; i++) {
            isPrime[i] = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime[i] = false;
                    break;
                }
            }
        }
    }

    static void primeWithAlgo() {
        for (int i = 1; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        isPrime[1] = false;

        for (int i = 2; i * i < isPrime.length; i++) {
            if (!isPrime[i]) {
                continue;
            }

            for (int j = 2; i * j < isPrime.length; j++){
                isPrime[i * j] = false;
            }
        }
    }
}
