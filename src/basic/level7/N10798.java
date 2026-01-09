package basic.level7;

import java.util.Scanner;

public class N10798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];

        for (int i = 0; i < arr.length; i++) {
            String S = sc.next();
            for (int j = 0; j < S.length(); j++) {
                arr[i][j] = S.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] != '\0') {
                    sb.append(arr[j][i]);
                }
            }
        }

        System.out.println(sb);
    }
}
