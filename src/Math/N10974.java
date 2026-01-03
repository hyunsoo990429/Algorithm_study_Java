package Math;

import java.io.*;
import java.util.*;

public class N10974 {

    static List<Integer> result = new ArrayList<>();
    static boolean[] arr;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new boolean[n + 1];
        permutation(0);
    }

    static void permutation(int level) {
        if (level == n) {
            for (Integer i : result) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            if (arr[i]) {
                continue;
            }

            result.add(i);
            arr[i] = true;

            permutation(level + 1);

            result.remove(result.size() - 1);
            arr[i] = false;
        }
    }
}
