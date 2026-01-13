package baaarkingDog.P0x06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class N10845_Queue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if (op.equals("push")) {
                int input = Integer.parseInt(st.nextToken());
                queue.offer(input);
            } else if (op.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.poll());
                }
            } else if (op.equals("size")) {
                System.out.println(queue.size());
            } else if (op.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (op.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peek());
                }
            } else if (op.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peekLast());
                }
            }
        }
    }
}
