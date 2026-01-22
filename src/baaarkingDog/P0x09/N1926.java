package baaarkingDog.P0x09;

import java.util.*;
import java.io.*;

public class N1926 {

    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        int maxSize = 0;

        Deque<int[]> queue = new ArrayDeque<>();

        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                if (st.hasMoreTokens()) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j] || arr[i][j] == 0) {
                    continue;
                }

                count++;
                queue.offer(new int[]{i, j});
                visited[i][j] = true;
                int size = 0;

                while(!queue.isEmpty()) {
                    size++;
                    int[] popValue = queue.poll();
                    int x = popValue[0];
                    int y = popValue[1];

                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];

                        if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                        if (visited[nx][ny] || arr[nx][ny] != 1) continue;

                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }

                maxSize = Math.max(maxSize, size);
            }
        }

        System.out.println(count);
        System.out.println(maxSize);
    }
}
