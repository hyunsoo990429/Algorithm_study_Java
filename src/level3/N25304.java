package level3;

import java.util.Scanner;

public class N25304 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scanner.nextInt();

        for (int i = 1; i <= (N / 4); i++) {
            sb.append("long ");
        }

        String result = sb.append("int").toString();
        System.out.println(result);
    }
}
