package level7;

import java.util.Scanner;

public class N2563 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[101][101];
        int size = 0;

        int T = sc.nextInt();
        while(T > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    arr[i][j] = 1;
                }
            }
            T--;
        }

        for (int[] ints : arr) {
            for (int i : ints) {
                if (i == 1) {
                    size++;
                }
            }
        }

        System.out.println(size);
    }
}
