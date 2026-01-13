package baaarkingDog.P0x05;

import java.io.*;
import java.util.*;

public class N1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        int lastPushed = 0;

        while (N-- > 0) {
            int target = Integer.parseInt(br.readLine());

            if (target > lastPushed) {
                for (int i = lastPushed + 1; i <= target; i++) {
                    stack.push(i);
                    sb.append("+\n");
                }
                lastPushed = target;
            }

            if (stack.peek() != null && stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.print(sb);
    }
}
