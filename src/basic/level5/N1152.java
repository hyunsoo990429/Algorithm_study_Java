package basic.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1152 {

    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        String[] split = S.split(" ");
        for (String s : split) {
            if (!s.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);
    }
}
