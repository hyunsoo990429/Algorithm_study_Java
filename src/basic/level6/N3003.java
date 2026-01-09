package basic.level6;

import java.util.*;

public class N3003 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,1,2,2,2,8};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - sc.nextInt();
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
