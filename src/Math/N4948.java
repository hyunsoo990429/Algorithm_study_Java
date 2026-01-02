package Math;

import java.io.*;

public class N4948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        String input;
        while (!(input = br.readLine()).equals("0")) {
            int N = Integer.parseInt(input);
            for (int i = N + 1; i <= 2 * N; i++){
                if (solve(i)){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
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
