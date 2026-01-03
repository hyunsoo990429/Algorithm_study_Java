package Implement;

import java.util.*;
import java.io.*;

public class N2309 {

    static List<Integer> result = new ArrayList<>();
    static int N = 9;
    static int r = 7;
    static int[] arr = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        combi(0, 0);
    }

    static void combi(int start, int level) {
        if (level == r) {
            int sum = 0;
            for (Integer i : result) {
                sum += i;
            }

            if (sum == 100) {
                Collections.sort(result);
                for (Integer i : result) {
                    System.out.println(i);
                }

                System.exit(0);
            }
        }

        for (int i = start; i < N; i++) {
            result.add(arr[i]);
            combi(i + 1, level + 1);
            result.remove(result.size() - 1);
        }
    }
}
