import java.io.*;
import java.util.*;

/**
 * 10430번 나머지
 * 메모리 : 14288 KB
 * 시간 : 124 ms
 * 코드 길이 : 593 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/10430
 *
 * 모듈러 연산 (Modular arithmetic)
 */

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());
        int c = Integer.parseInt(tk.nextToken());

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a+c)*(b%c))%c);
    }
}
