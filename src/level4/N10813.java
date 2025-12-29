package level4;

import java.util.Scanner;

public class N10813 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        while(M > 0) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int temp = 0;

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            M--;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
