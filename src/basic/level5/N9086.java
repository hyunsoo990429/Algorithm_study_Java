package basic.level5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T > 0 ) {
            String S = br.readLine();
            System.out.print(S.charAt(0));
            System.out.println(S.charAt(S.length() - 1));
            T--;
        }
    }
}
