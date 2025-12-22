package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int plusM = Integer.parseInt(br.readLine());

        int temp = (m + plusM) % 60;
        h = (h + (m + plusM) / 60) % 24;
        m = temp;

        System.out.println(h + " " + m);

        br.close();
    }
}
