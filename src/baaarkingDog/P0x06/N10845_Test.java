package baaarkingDog.P0x06;

import java.util.*;
import java.io.*;

public class N10845_Test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        QueueTest queue = new QueueTest();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if (op.equals("push")) {
                int input = Integer.parseInt(st.nextToken());
                queue.push(input);
            } else if (op.equals("pop")) {
                System.out.println(queue.pop());
            } else if (op.equals("size")) {
                System.out.println(queue.size());
            } else if (op.equals("empty")) {
                System.out.println(queue.empty());
            } else if (op.equals("front")) {
                System.out.println(queue.front());
            } else if (op.equals("back")) {
                System.out.println(queue.back());
            }
        }
    }

    static class QueueTest {

        private final int DEFAULT_CAPACITY = 10000;
        private int[] arr;
        private int head;
        private int tail;
        private int size;

        QueueTest() {
            arr = new int[DEFAULT_CAPACITY];
            head = 0;
            tail = 0;
            size = 0;
        }

        public void push(int x) {
            arr[tail++] = x;
            size++;
        }

        public int pop() {
            if (size() == 0) return -1;
            size--;
            return arr[head++];
        }

        public int size() {
            return size;
        }

        public int empty() {
            return (tail == head) ? 1 : 0;
        }

        public int front() {
            if (size() == 0) return -1;
            return arr[head];
        }

        public int back() {
            if (size() == 0) return -1;
            return arr[tail - 1];
        }

    }
}
