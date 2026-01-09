package basic.level6;

import java.util.Scanner;

public class N1316 {


    public static void main(String[] args) {
        int count = 0;

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int w = T;

        while (T > 0) {
            boolean[] arr = new boolean[26];

            String input = sc.next();
            arr[input.charAt(0) - 'a'] = true;

            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i - 1) == input.charAt(i)) {
                    continue;
                } else if (input.charAt(i - 1) != input.charAt(i) && arr[input.charAt(i) - 'a']) {
                    count++;
                    break;
                } else {
                    arr[input.charAt(i) - 'a'] = true;
                }
            }

            T--;
        }

        System.out.println(w - count);
    }
}
