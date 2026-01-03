package Implement;

import java.io.*;

public class N9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String pattern = br.readLine();
        int starIndex = pattern.indexOf("*");
        String s = pattern.substring(0, starIndex);
        String e = pattern.substring(starIndex + 1);

        while (N-- > 0) {
            String input = br.readLine();

            if (input.length() < s.length() + e.length()) {
                System.out.println("NE");
                continue;
            }

            if (input.startsWith(s) && input.endsWith(e)) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}

