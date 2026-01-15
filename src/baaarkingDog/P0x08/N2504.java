package baaarkingDog.P0x08;

import java.util.*;
import java.io.*;

public class N2504 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Deque<Character> stack = new ArrayDeque<>();
        int result = 0;
        int temp = 1;

        for (int i = 0; i < input.length(); i++) {
            Character a = input.charAt(i);

            if (a == '(') {
                stack.push(a);
                temp *= 2;
            }

            else if (a == '[') {
                stack.push(a);
                temp *= 3;
            }

            else if (a == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    result = 0;
                    break;
                }

                if (input.charAt(i - 1) == '(') {
                    result += temp;
                }
                temp /= 2;
                stack.pop();
            }

            else if (a == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    result = 0;
                    break;
                }

                if (input.charAt(i - 1) == '[') {
                    result += temp;
                }

                temp /= 3;
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
