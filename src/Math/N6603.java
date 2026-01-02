package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class N6603 {

    static List<Integer> result = new ArrayList<>();
    static int[] input;
    static int r = 6;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a;

        while (!(a = br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(a);

            n = Integer.parseInt(st.nextToken());
            input = new int[n];

            for (int i = 0; i < n; i++) {
                input[i] = Integer.parseInt(st.nextToken());
            }

            combi(0,0);
            System.out.println();
        }
    }

    static void combi(int start, int level) {
        if (level == r) {
            for (int n : result) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        for (int i = start; i < n; i++) {
            result.add(input[i]);
            combi(i + 1, level + 1);
            result.remove(result.size() - 1);
        }
    }
}
