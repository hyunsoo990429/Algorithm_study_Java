package baaarkingDog.P0x04;

import java.io.*;
import java.util.*;

public class N5397_LinkedIterator {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String input = br.readLine();
            List<Character> list = new LinkedList<>();
            ListIterator<Character> iterator = list.listIterator();

            for (int i = 0; i < input.length(); i++) {
                Character op = input.charAt(i);
                if (op.equals('<')) {
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    }
                } else if (op.equals('>')) {
                    if (iterator.hasNext()) {
                        iterator.next();
                    }
                } else if (op.equals('-')) {
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }
                } else {
                    iterator.add(op);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (Character c : list) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}
