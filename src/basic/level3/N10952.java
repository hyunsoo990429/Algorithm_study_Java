package basic.level3;


import java.io.*;
import java.util.StringTokenizer;

public class N10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        for (; ;) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (b == 0 && c == 0) {
                break;
            }

            bw.write((b + c) + "\n");
        }
        bw.close();
        br.close();
    }
}
