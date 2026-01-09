package basic.level4;

import java.util.Scanner;

public class N3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        boolean[] arr = new boolean[42];

        for (int i = 0; i < 10; i++) {
            int input = sc.nextInt();
            arr[input % 42] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
