import java.io.*;
import java.util.*;

/**
 * 2745번 진법 변환
 * 메모리 : 14296 KB
 * 시간 : 220 ms
 * 코드 길이 : 729 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/2745
 *
 */

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int result = 0;
        for (int i = s.length() -1; i >= 0 ; i--) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                result += (c - 'A' + 10) * tmp;
            } else {
                result += (c - '0') * tmp;
            }
            tmp *= b;
        }
        System.out.println(result);
    }
}