package basic.level7;

import java.util.*;

public class N2738 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += sc.nextInt();
            }
        }

        for (int[] ints : arr) {
            for (int i :ints){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
