package baaarkingDog.P0x04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N1158_Queue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            queue.offer(i + 1);
        }

        int idx = 0;
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        while (true) {
            for (int i = 0; i < K - 1; i++) {
                Integer pollValue = queue.poll();
                queue.offer(pollValue);
            }

            Integer pollValue = queue.poll();
            sb.append(pollValue);

            if (queue.isEmpty()) {
                break;
            }

            sb.append(", ");
        }
        sb.append('>');
        System.out.println(sb);
    }
}

