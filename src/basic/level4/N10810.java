package basic.level4;

import java.util.Scanner;

public class N10810 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        while(M > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int l = (i - 1); l < j; l++) {
                arr[l] = k;
            }

            M--;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
