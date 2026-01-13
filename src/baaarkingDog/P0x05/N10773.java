package baaarkingDog.P0x05;

import java.util.*;
import java.io.*;

public class N10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        long result = 0;

        while (N-- > 0) {
            String op = br.readLine();

            if (op.equals("0")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        for (Integer i : stack) {
            result += i;
        }

        System.out.println(result);
    }
}
