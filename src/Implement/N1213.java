package Implement;

import java.io.*;
import java.util.*;

public class N1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] alpha = new int[26];
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            alpha[input.charAt(i) - 'A'] += 1;
        }

        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < alpha.length; i++) {
            if (count == 2) {
                break;
            }

            if (alpha[i] % 2 != 0) {
                count++;
                odd.append((char) (i + 'A'));
                if (alpha[i] - 1 > 0) {
                    for (int j = 1; j <= (alpha[i] - 1) / 2; j++) {
                        even.append((char) (i + 'A'));
                    }
                }
            } else {
                for (int j = 1; j <= alpha[i] / 2; j++) {
                    even.append((char) (i + 'A'));
                }
            }
        }

        if (count == 2) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            String half = even.toString();
            System.out.print(half);
            System.out.println(odd.append(even.reverse()));
        }

    }
}

