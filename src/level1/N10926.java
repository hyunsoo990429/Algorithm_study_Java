package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10926 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
        String result = sb.append(input).append("??!").toString();

        System.out.println(result);
    }
}
