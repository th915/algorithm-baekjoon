import java.io.*;
import java.util.*;

/**
 * 2230번 수 고르기
 * 메모리 : 27144 KB
 * 시간 : 368 ms
 * 코드 길이 : 964 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/2230
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tk.nextToken());
        long m = Long.parseLong(tk.nextToken());

        long[] arrays = new long[n];
        for (int i = 0; i < n; i++) {
            arrays[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(arrays);

        int p1 = 0;
        int p2 = 1;
        long sub = Long.MAX_VALUE;
        while (p2 < n) {
            long tmp = arrays[p2] - arrays[p1];

            if (tmp >= m) {
                sub = Math.min(sub, tmp);
                p1++;
                if (p1 == p2){
                    p2++;
                }
            } else {
                p2++;
            }
        }
        System.out.println(sub);
    }
}