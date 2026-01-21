package baaarkingDog.P0x08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class N10799_AnotherLogic {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Deque<Character> stack = new ArrayDeque<>();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();

                if (input.charAt(i - 1) == '(') {
                    sum += stack.size();
                }
                else {
                    sum += 1;// 막대기 하나가 끝났으므로 조각 1개 추가
                }
            }
        }

        System.out.println(sum);
    }
}

