package baaarkingDog.P0x05;

import java.io.*;
import java.util.*;

public class N10838_Stack {

    public static void main(String[] args) throws IOException {
        Deque<Integer> stack = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if (op.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (op.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (op.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (op.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (op.equals("top")) {
                Integer topVal = stack.peek();
                sb.append(topVal == null ? -1 : topVal).append("\n");
            }
        }
        System.out.print(sb);
    }
}
