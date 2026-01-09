package basic.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2480 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c) {
            // 1. 세 숫자가 모두 같을 때
            System.out.println(10000 + a * 1000);
        } else if (a == b || a == c) {
            // 2. 두 숫자가 같을 때 (a가 포함된 경우)
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            // 3. 두 숫자가 같을 때 (b와 c만 같은 경우)
            System.out.println(1000 + b * 100);
        } else {
            // 4. 모두 다를 때
            System.out.println(Math.max(a, Math.max(b, c)) * 100);
        }
    }
}
