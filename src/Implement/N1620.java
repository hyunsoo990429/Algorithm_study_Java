package Implement;

import java.io.*;
import java.util.*;

public class N1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> num = new HashMap<>();
        Map<String, Integer> word = new HashMap<>();
        int key = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        while (N-- > 0) {
            String input = br.readLine();
            num.put(key, input);
            word.put(input, key);
            key++;
        }

        while (M-- > 0) {
            String input = br.readLine();
            if (input.charAt(0) >= '0' && input.charAt(input.length() - 1) <= '9') {
                int i = Integer.parseInt(input);
                System.out.println(num.get(i));
            } else {
                System.out.println(word.get(input));
            }
        }
    }
}
