package basic.level5;

import java.io.*;
import java.util.*;

public class N2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();

        int a = Integer.parseInt(new StringBuilder(A).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(B).reverse().toString());

        System.out.println(Math.max(a, b));
    }
}
