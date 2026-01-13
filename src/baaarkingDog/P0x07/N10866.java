package baaarkingDog.P0x07;

import java.util.*;
import java.io.*;

public class N10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        DequeTest deque = new DequeTest();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if (op.equals("push_front")) {
                int input = Integer.parseInt(st.nextToken());
                deque.offerFirst(input);
            } else if (op.equals("push_back")) {
                int input = Integer.parseInt(st.nextToken());
                deque.offerLast(input);
            } else if (op.equals("pop_front")) {
                System.out.println(deque.pollFirst());
            } else if (op.equals("pop_back")) {
                System.out.println(deque.pollLast());
            }else if (op.equals("size")) {
                System.out.println(deque.size());
            } else if (op.equals("empty")) {
                System.out.println(deque.empty());
            } else if (op.equals("front")) {
                System.out.println(deque.peekFirst());
            } else if (op.equals("back")) {
                System.out.println(deque.peekLast());
            }
        }
    }

    static class DequeTest {
        private final int DEFAULT_CAPACITY = 10000;
        private int[] arr;
        private int head;
        private int tail;
        private int size;

        DequeTest() {
            arr = new int[DEFAULT_CAPACITY * 2 ];
            head = arr.length / 2;
            tail = arr.length / 2;
            size = 0;
        }

        public void offerFirst(int x) {
            arr[--head] = x;
            size++;
        }

        public void offerLast(int x) {
            arr[tail++] = x;
            size++;
        }

        public int pollFirst() {
            if (size == 0) {
                return -1;
            } else {
                size--;
                return arr[head++];
            }
        }

        public int pollLast() {
            if (size == 0) {
                return -1;
            } else {
                size--;
                return arr[--tail];
            }
        }

        public int size() {
            return size;
        }

        public int empty() {
            if (size == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        public int peekFirst() {
            if (size == 0) {
                return -1;
            } else {
                return arr[head];
            }
        }

        public int peekLast() {
            if (size == 0) {
                return -1;
            } else {
                return arr[tail - 1];
            }
        }
    }
}
