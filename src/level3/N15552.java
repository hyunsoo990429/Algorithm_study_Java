package level3;


import java.io.*;
import java.util.StringTokenizer;

public class N15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        while (a > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            bw.write((b + c) + "\n");
            a--;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
