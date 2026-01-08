package baaarkingDog.P0x03;

import java.io.*;
import java.util.*;

public class N1475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int max = 0;
        String N = br.readLine();

        for (int i = 0; i < N.length(); i++) {
            arr[N.charAt(i) - '0'] += 1;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9) {
                continue;
            }

            max = Math.max(max, arr[i]);
        }

        int a = Math.round((float) (arr[6] + arr[9]) / 2);
        max = Math.max(max, a);
        System.out.println(max);
    }
}
