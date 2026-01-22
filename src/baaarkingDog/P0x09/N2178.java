package baaarkingDog.P0x09;

import java.util.*;
import java.io.*;

public class N2178 {
    static int[][] arr;
    static boolean[][] visited;
    static int[][] dist;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] splitNum = br.readLine().split(" ");

        int N = Integer.parseInt(splitNum[0]);
        int M = Integer.parseInt(splitNum[1]);

        arr = new int[N][M];
        visited = new boolean[N][M];
        dist = new int[N][M];

        Deque<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            for (int j = 0; j < M; j++) {
                arr[i][j] = input.charAt(j) - '0';
            }
        }

        queue.offer(new int[]{0, 0});
        dist[0][0] = 1;

        while(!queue.isEmpty()) {
            int[] pollValue = queue.poll();

            int x = pollValue[0];
            int y = pollValue[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (visited[nx][ny] || arr[nx][ny] != 1) continue;

                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;
                queue.offer(new int[]{nx, ny});
            }
        }

        System.out.println(dist[N - 1][M - 1]);
    }
}
