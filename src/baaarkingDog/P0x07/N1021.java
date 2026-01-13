package baaarkingDog.P0x07;

import java.util.*;
import java.io.*;

public class N1021 {

    public static void main(String[] args) throws IOException {
        LinkedList<Integer> deque = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 1; i <= N; i++) {
            deque.offerLast(i);
        }

        st = new StringTokenizer(br.readLine());
        while (M-- > 0) {
            int v = Integer.parseInt(st.nextToken());

            while(deque.peekFirst() != v) {
                int posIdx = deque.indexOf(v);
                int halfSize = (deque.size() / 2);
                if (posIdx > halfSize) {
                    for (int i = 0; i < (deque.size() - posIdx); i++) {
                        int findValue = deque.pollLast();
                        deque.offerFirst(findValue);
                        count++;
                    }
                } else {
                    for (int i = 0; i < posIdx; i++) {
                        int findValue = deque.pollFirst();
                        deque.offerLast(findValue);
                        count++;
                    }
                }
            }

            deque.pollFirst();
        }

        System.out.println(count);
    }
}
