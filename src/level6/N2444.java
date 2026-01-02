package level6;

import java.util.Scanner;

public class N2444 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = N; i > 0; i--) {
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
