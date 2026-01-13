package baaarkingDog.P0x05;

import java.util.*;
import java.io.*;

public class N10838_Test {

    public static void main(String[] args) throws IOException {
        StackTest stack = new StackTest();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            if (op.equals("push")) {
                int value = Integer.parseInt(st.nextToken());
                stack.push(value);
            } else if (op.equals("pop")) {
                System.out.println(stack.pop());
            } else if (op.equals("size")) {
                System.out.println(stack.size());
            } else if (op.equals("empty")) {
                System.out.println(stack.empty());
            } else if (op.equals("top")) {
                System.out.println(stack.top());
            }
        }
    }

    static class StackTest {

        private final int DEFAULT_CAPACITY = 10000;
        private int capacity;
        private int[] arr;
        private int top;

        StackTest () {
            arr = new int[DEFAULT_CAPACITY];
            top = -1;
        }

        StackTest (int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            top = -1;
        }

        public void push(int x) {
            arr[++top] = x;
        }

        public int pop() {
            if (top == -1) {
                return -1;
            } else {
                return arr[top--];
            }
        }

        public int size() {
            return top + 1;
        }

        public int empty() {
            if (top == -1) {
                return 1;
            } else {
                return 0;
            }
        }

        public int top() {
            if (top == -1) {
                return -1;
            } else {
                return arr[top];
            }
        }
    }
}
