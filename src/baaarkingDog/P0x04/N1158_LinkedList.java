package baaarkingDog.P0x04;

import java.io.*;
import java.util.*;

public class N1158_LinkedList {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }

        int idx = 0;
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        while (true) {
            idx = (idx + (K - 1)) % list.size();
            sb.append(list.remove(idx));

            if (list.isEmpty()) {
                break;
            }

            sb.append(", ");
        }
        sb.append('>');
        System.out.println(sb);
    }
}

