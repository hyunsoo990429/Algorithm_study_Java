package level4;

import java.util.Arrays;
import java.util.Scanner;

public class N10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);

    }
}
