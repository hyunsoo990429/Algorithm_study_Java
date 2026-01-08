package baaarkingDog.P0x03;

import java.io.*;
import java.util.*;

public class N1919 {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a'] += 1;
        }

        String b = br.readLine();
        for (int i = 0; i < b.length(); i++) {
            arr[b.charAt(i) - 'a'] -= 1;
        }

        for (int i : arr) {
            if (i != 0) {
                count += Math.abs(i);
            }
        }

        System.out.println(count);
    }
}
