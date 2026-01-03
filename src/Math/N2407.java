package Math;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class N2407 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BigInteger[][] arr = new BigInteger[101][101];

        for (int i = 1; i <= n; i++) {
            for(int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = BigInteger.ONE;
                }else {
                    arr[i][j] = arr[i - 1][j - 1].add(arr[i - 1][j]);
                }
            }
        }

        System.out.println(arr[n][m]);
    }

}
