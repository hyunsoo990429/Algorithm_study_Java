package Math;

import java.util.*;
import java.io.*;

public class N1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;

        while(T > 0) {
            if (solve(Integer.parseInt(st.nextToken()))) {
                count++;
            }
            T--;
        }

        System.out.println(count);
    }

    static boolean solve(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
