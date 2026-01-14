package baaarkingDog.P0x07;

import java.io.*;
import java.util.*;

public class N5430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();

            Deque<Integer> deque = new ArrayDeque<>();

            String[] sArr = input.substring(1, input.length() - 1).split(",");
            for (int i = 0; i < n; i++) {
                deque.add(Integer.parseInt(sArr[i]));
            }

            boolean isReversed = false;
            boolean isError = false;

            for (char cmd : p.toCharArray()) {
                if (cmd == 'R') {
                    isReversed = !isReversed;
                } else {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if (isReversed) deque.pollLast();
                    else deque.pollFirst();
                }
            }

            if (isError) {
                sb.append("error\n");
            } else {
                sb.append("[");
                while (!deque.isEmpty()) {
                    sb.append(isReversed ? deque.pollLast() : deque.pollFirst());
                    if (!deque.isEmpty()) sb.append(",");
                }
                sb.append("]\n");
            }
        }

        System.out.println(sb);
    }
}
