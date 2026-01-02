package level6;

import java.util.Scanner;

public class N10988 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        String r = new StringBuilder(i).reverse().toString();

        if (i.equals(r)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
