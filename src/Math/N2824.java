package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2824 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long result = 1;
        boolean isOver = false;

        int a = Integer.parseInt(st.nextToken());
        int[] c = new int[a];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            c[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st2.nextToken());
        int[] d = new int[b];

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            d[i] = Integer.parseInt(st3.nextToken());
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < d.length; j++) {
                int e = gcd(c[i], d[j]);

                if (e > 1) {
                    result *= e;

                    if (result >= 100000000) {
                        isOver = true;
                        result %= 1000000000;
                    }

                    c[i] /= e;
                    d[j] /= e;
                }
            }
        }

        if (isOver) {
            System.out.printf("%09d", result);
        } else {
            System.out.println(result);
        }
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
