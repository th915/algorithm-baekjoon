import java.io.*;
import java.util.*;

/**
 * 2609번 최대공약수와 최소공배수
 * 메모리 : 14236 KB
 * 시간 : 132 ms
 * 코드 길이 : 825 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/2609
 *
 * 유클리드 호제법 (Euclidean Algorithm)
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(tk.nextToken());
        int y = Integer.parseInt(tk.nextToken());

        if (x > y){
            sb.append(gcd(x, y)).append("\n").append(lcm(x, y));
        } else {
            sb.append(gcd(y, x)).append("\n").append(lcm(y, x));
        }
        System.out.println(sb);
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}