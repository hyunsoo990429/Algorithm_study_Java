package baaarkingDog.P0x04;

import java.io.*;
import java.util.StringTokenizer;

public class N7308_Test {

    public static void main(String[] args) throws IOException {
        Editor editor = new Editor();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int M = Integer.parseInt(br.readLine());

        for (int i  = 0; i < N.length(); i++) {
            editor.add(N.charAt(i));
        }

        int cursor = editor.size;
        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if (order.equals("L")) {
                if (cursor != 0) {
                    cursor--;
                }
            } else if (order.equals("D")) {
                if (cursor < editor.getSize()) {
                    cursor++;
                }
            } else if (order.equals("B")) {
                if (cursor != 0) {
                    editor.remove(cursor);
                    cursor--;
                }
            } else if (order.equals("P")) {
                if (cursor == editor.getSize()) {
                    editor.add(st.nextToken().charAt(0));
                    cursor++;
                } else {
                    editor.add(st.nextToken().charAt(0), cursor);
                    cursor++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < editor.getSize(); i++) {
            sb.append(editor.getNode(i).input);
        }

        System.out.println(sb);
    }

    static class Editor {

        Node first;
        int size;

        public void add(char input) {
            Node newNode = new Node(input);
            if (size == 0) {
                first = newNode;
            } else {
                Node findNode = getLastNode();
                findNode.next = newNode;
            }
            size++;
        }

        public void add(char input, int idx) {
            Node newNode = new Node(input);
            if (idx == 0) {
                newNode.next = first;
                first = newNode;
            } else {
                Node findNode = getNode(idx - 1);
                newNode.next = findNode.next;
                findNode.next = newNode;
            }
            size++;
        }

        public void remove(int idx) {
            Node targetNode = getNode(idx);
            if (idx == 0) {
                first = targetNode.next;
            } else {
                Node prevNode = getNode(idx - 1);
                prevNode.next = targetNode.next;
            }
            size--;
        }

        public Node getNode(int idx) {
            Node x = first;
            for (int i = 0; i < idx; i++) {
                x = x.next;
            }
            return x;
        }

        public Node getLastNode() {
            Node x = first;
            while (x.next != null) {
                x = x.next;
            }
            return x;
        }

        public int getSize() {
            return size;
        }

        static class Node{
            char input;
            Node next;

            public Node(char input) {
                this.input = input;
            }

        }
    }
}
