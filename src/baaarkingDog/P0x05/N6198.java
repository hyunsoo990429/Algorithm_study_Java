package baaarkingDog.P0x05;

import java.io.*;
import java.util.*;

public class N6198 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long count = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            int height = Integer.parseInt(br.readLine());

            while (!stack.isEmpty() && stack.peek() <= height) {
                stack.pop();
            }

            count += stack.size();
            stack.push(height);
        }
        System.out.println(count);
    }
}
