package level3;

import java.util.Scanner;

public class N10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        while(input > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + b);
            input--;
        }
    }
}
