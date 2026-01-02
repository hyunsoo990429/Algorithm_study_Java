package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class N2407 {

    static List<Integer> result = new ArrayList<>();
    static int n;
    static int m;
    static Long count = 0L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        combi(1, 0);
        System.out.println(count);
    }

    static void combi(int start, int level) {
        if (level == m) {
            count++;
        }

        for (int i = start; i <= n; i++) {
            result.add(i);
            combi(i + 1, level + 1);
            result.remove(result.size() - 1);
        }
    }
}
