package Implement;

import java.io.*;

public class N11655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder S = new StringBuilder(br.readLine());
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= 97) {
                int temp = S.charAt(i) - 'a';
                temp = (temp + 13) % 26;
                result.append((char) (temp + 'a'));
            } else if (S.charAt(i) >= 65) {
                int temp = S.charAt(i) - 'A';
                temp = (temp + 13) % 26;
                result.append((char) (temp + 'A'));
            } else {
                result.append(S.charAt(i));
            }
        }

        System.out.println(result);
    }
}
