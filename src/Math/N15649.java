package Math;

import java.io.*;
import java.util.*;

public class N15649 {

    static List<Integer> result;
    static boolean[] visited;
    static int r;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        result = new ArrayList<>();

        permutation(0);
    }

    static void permutation(int level) {
        if (level == r) {
            for (int n : result) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            if (visited[i]) {
                continue;
            }

            result.add(i);
            visited[i] = true;

            permutation(level + 1);

            result.remove(result.size() - 1);
            visited[i] = false;
        }
    }
}
