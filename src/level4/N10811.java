package level4;

import java.util.Arrays;
import java.util.Scanner;

public class N10811 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));

        while(M > 0) {

            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            for (int k = i; k <= j; k++) {
                int temp = arr[k];
                arr[k] = arr[j];

            }

            System.out.println(Arrays.toString(arr));


            M--;
        }

        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
