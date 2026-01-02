package Math;

import java.io.*;
import java.util.*;

public class N15650 {

    static List<Integer> result = new ArrayList<>();
    static int n;
    static int r;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        combi(1, 0);
    }

    static void combi(int start, int level) {
        if (level == r) {
            for(Integer i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int i = start; i <= n; i++) {
            result.add(i);
            combi(i + 1, level + 1);
            result.remove(result.size() - 1);
        }
    }
}
