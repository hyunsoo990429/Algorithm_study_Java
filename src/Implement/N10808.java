package Implement;

import java.util.*;
import java.io.*;

public class N10808 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a'] += 1;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
