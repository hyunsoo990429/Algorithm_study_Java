package baaarkingDog.P0x04;

import java.io.*;
import java.util.*;

public class N7308_LinkedList {

    public static void main(String[] args) throws IOException {
        List<String> list = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int M = Integer.parseInt(br.readLine());

        for (int i  = 0; i < N.length(); i++) {
            list.add(String.valueOf(N.charAt(i)));
        }

        int cursor = list.size();
        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if (order.equals("L")) {
                if (cursor != 0) {
                    cursor--;
                }
            } else if (order.equals("D")) {
                if (cursor < list.size()) {
                    cursor++;
                }
            } else if (order.equals("B")) {
                if (cursor != 0) {
                    list.remove(cursor);
                    cursor--;
                }
            } else if (order.equals("P")) {
                if (cursor == list.size()) {
                    list.add(String.valueOf(st.nextToken().charAt(0)));
                    cursor++;
                } else {
                    list.add(cursor, String.valueOf(st.nextToken().charAt(0)));
                    cursor++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }

        System.out.println(sb);
    }
}
