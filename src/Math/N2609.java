package Math;

import java.io.*;
import java.util.*;

public class N2609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));

    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
