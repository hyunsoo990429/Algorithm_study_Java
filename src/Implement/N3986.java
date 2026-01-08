package Implement;

import java.io.*;
import java.util.*;

public class N3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while (N-- > 0) {
            Stack<String> stack = new Stack<>();
            String input = br.readLine();

            for (int i = 0; i < input.length(); i++) {
                String s = String.valueOf(input.charAt(i));

                if (stack.empty()){
                    stack.push(s);
                }else if (!stack.empty() && stack.peek().equals(s)) {
                    stack.pop();
                } else if (!stack.empty() && !stack.peek().equals(s)) {
                    stack.push(s);
                }
            }

            if (stack.empty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}

