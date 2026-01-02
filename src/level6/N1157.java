package level6;

import java.util.Arrays;
import java.util.Scanner;

public class N1157 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next().toUpperCase();
        int max = -1;
        int index = -1;
        boolean flag = false;

        int[] arr = new int[26];
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'A'] += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
                flag = false;
            } else if (arr[i] == max) {
                flag = true;
            }
        }

        if (flag) {
            System.out.print("?");
        } else {
            System.out.println((char) (index + 'A'));
        }
    }
}
