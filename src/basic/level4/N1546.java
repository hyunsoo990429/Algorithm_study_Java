package basic.level4;

import java.util.Arrays;
import java.util.Scanner;

public class N1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        double sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / arr[N - 1] * 100;
        }

        for (double i : arr) {
            sum += i;
        }

        sum = sum / N;
        System.out.printf("%.2f", sum);
    }
}
