package baaarkingDog.P0x05;

import java.io.*;
import java.util.*;

public class N17298 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] input = new int[N];
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
            result[i] = -1;
        }

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && input[stack.peek()] < input[i]) {
                result[stack.pop()] = input[i];
            }
            stack.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }
}
