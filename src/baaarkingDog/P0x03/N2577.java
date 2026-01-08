package baaarkingDog.P0x03;

import java.io.*;
import java.util.*;

public class N2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String result = String.valueOf(A * B * C);
        for (int i = 0; i < result.length(); i++) {
            arr[result.charAt(i) - '0'] += 1;
        }

        for(int i : arr) {
            System.out.println(i);
        }
    }
}
