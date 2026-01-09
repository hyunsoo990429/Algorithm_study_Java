package baaarkingDog.P0x04;

import java.io.*;
import java.util.*;

public class N7308_ListIterator {

    public static void main(String[] args) throws IOException {
        List<String> list = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int M = Integer.parseInt(br.readLine());

        for (int i  = 0; i < N.length(); i++) {
            list.add(String.valueOf(N.charAt(i)));
        }

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if (order.equals("L")) {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                }
            } else if (order.equals("D")) {
                if (iterator.hasNext()) {
                    iterator.next();
                }
            } else if (order.equals("B")) {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                    iterator.remove();
                }
            } else if (order.equals("P")) {
                iterator.add(String.valueOf(st.nextToken().charAt(0)));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }

        System.out.println(sb);
    }
}
