package Implement;

import java.io.*;
import java.util.*;

public class N1159 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        boolean found = false;

        while (N-- > 0) {
            String input = br.readLine();
            arr[input.charAt(0) - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                char result = (char) (i + 'a');
                System.out.print(result);
                found = true;
            }
        }

        if (!found) {
            System.out.print("PREDAJA");
        }
    }
}
