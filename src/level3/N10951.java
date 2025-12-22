package level3;


import java.io.*;
import java.util.StringTokenizer;

public class N10951 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String r;
        while ((r = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(r, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a + b);
        }
        br.close();
    }
}
