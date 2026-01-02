package Math;

import java.io.*;
import java.util.*;

public class N1182 {

    static List<Integer> result = new ArrayList<>();
    static int[] arr;
    static int N;
    static int S;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int r = 1; r <= N; r++){
            combi(0, 0, r);
            result.clear();
        }

        System.out.println(count);
    }

    static void combi(int start, int level, int r) {
        if (level == r) {
            int sum = 0;
            for (Integer i : result) {
                sum += i;
            }
            if (sum == S) {
                count++;
            }
        }

        for (int i = start; i < N; i++) {
            result.add(arr[i]);
            combi(i + 1, level + 1, r);
            result.remove(result.size() - 1);
        }
    }
}
