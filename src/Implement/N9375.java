package Implement;

import java.io.*;
import java.util.*;

public class N9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            HashMap<String, Integer> m = new HashMap<>();
            StringTokenizer st;

            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();

                m.put(key, m.getOrDefault(key, 0) + 1);
            }

            long result = 1;
            for (Integer value : m.values()) {
                result *= (value + 1);
            }

            System.out.println(result - 1);
        }
    }
}

