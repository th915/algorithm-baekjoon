import java.io.*;
import java.util.*;

/**
 * 1874번 스택 수열
 * 메모리 : 26008 KB
 * 시간 : 348 ms
 * 코드 길이 : 1173 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/1874
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        boolean[] arrays = new boolean[n+1];
        Arrays.fill(arrays, true);
        int max = 0;
        int p = 1;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (arrays[x]) {
                for (int j = max+1; j <= x; j++) {
                    sb.append("+").append("\n");
                    p = j;
                }
                max = Math.max(x, max);

                for (int j = p; j >= x; j--) {
                    if (arrays[j]){
                        sb.append("-").append("\n");
                    }
                    arrays[j] = false;
                    p = j-1;
                }
            } else {
                System.out.println("NO");
                break;
            }

            if (i == n-1){
                System.out.println(sb);
            }
        }
    }
}
