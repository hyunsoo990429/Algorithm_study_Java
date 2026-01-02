package Math;

import java.util.*;
import java.io.*;

public class N1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int srt = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        for (int i = srt; i <= end; i++) {
            if (solve(i)) {
                System.out.println(i);
            }
        }
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
