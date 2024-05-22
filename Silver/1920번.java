import java.io.*;
import java.util.*;

/**
 * 1920번 수 찾기
 * 메모리 : 47844 KB
 * 시간 : 712 ms
 * 코드 길이 : 1052 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/1920
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        Long[] arrays = new Long[n];
        for (int i = 0; i < n; i++) {
            arrays[i] = Long.parseLong(tk.nextToken());
        }
        Arrays.sort(arrays);

        int m = Integer.parseInt(br.readLine());
        tk = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            Long tmp = Long.parseLong(tk.nextToken());
            if (Arrays.binarySearch(arrays, tmp) >= 0) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.println(sb);
    }
}
