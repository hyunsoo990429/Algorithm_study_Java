package baaarkingDog.P0x06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class N18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();


        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if (op.equals("push")) {
                int input = Integer.parseInt(st.nextToken());
                queue.offer(input);
            } else if (op.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if (op.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (op.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (op.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else if (op.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.peekLast()).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
