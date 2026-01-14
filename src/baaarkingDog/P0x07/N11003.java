package baaarkingDog.P0x07;

import java.io.*;
import java.util.*;

public class N11003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<int[]> deque = new ArrayDeque<>();


        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            while(!deque.isEmpty() && deque.peekLast()[0]>num){
                deque.pollLast();
            }
            deque.add(new int[]{num, i});
            if(deque.peekFirst()[1] == i - L) deque.pollFirst();


            int d = deque.peekFirst()[0];
            sb.append(d+" ");
        }
        System.out.println(sb);
    }
}
