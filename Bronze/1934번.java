import java.io.*;
import java.util.*;

/**
 * 1934번 최소공배수
 * 메모리 : 14504 KB
 * 시간 : 140 ms
 * 코드 길이 : 876 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/1934
 *
 * 유클리드 호제법 (Euclidean Algorithm)
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            sb.append(lcm(Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken()))).append("\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
