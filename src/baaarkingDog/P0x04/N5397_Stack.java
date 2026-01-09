package baaarkingDog.P0x04;

import java.io.*;
import java.util.*;

public class N5397_Stack {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String input = br.readLine();
            Deque<Character> leftStack = new ArrayDeque<>();
            Deque<Character> rightStack = new ArrayDeque<>();

            for (int i = 0; i < input.length(); i++) {
                Character op = input.charAt(i);

                if (op.equals('<')) {
                    if (!leftStack.isEmpty()) {
                        Character findOp = leftStack.peek();
                        leftStack.pop();
                        rightStack.push(findOp);
                    }
                } else if (op.equals('>')) {
                    if (!rightStack.isEmpty()) {
                        Character findOp = rightStack.peek();
                        rightStack.pop();
                        leftStack.push(findOp);
                    }
                } else if (op.equals('-')) {
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                } else {
                    leftStack.push(op);
                }
            }

            StringBuilder sb = new StringBuilder();
            while (!leftStack.isEmpty()) {
                sb.append(leftStack.pollLast());
            }

            while (!rightStack.isEmpty()) {
                sb.append(rightStack.pop());
            }

            System.out.println(sb);
        }
    }
}
