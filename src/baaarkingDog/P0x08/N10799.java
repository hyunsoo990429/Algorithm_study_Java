package baaarkingDog.P0x08;

import java.io.*;
import java.util.*;

public class N10799 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Deque<Character> stack = new ArrayDeque<>();
        int sum = 0;
        int pipeCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
                pipeCount++;
            } else if (input.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.push(input.charAt(i));
                    pipeCount--;
                    sum += pipeCount;
                } else if (!stack.isEmpty() && stack.peek() == ')') {
                    stack.push(input.charAt(i));
                    pipeCount--;
                    sum += 1;
                }
            }
        }

        System.out.println(sum);
    }
}

