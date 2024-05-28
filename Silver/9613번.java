import java.io.*;
import java.util.StringTokenizer;

/**
 * 9613번 GCD 합
 * 메모리 : 13992 KB
 * 시간 : 120 ms
 * 코드 길이 : 1173 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/9613
 *
 * 유클리드 호제법 (Euclidean Algorithm)
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arrays = new int[Integer.parseInt(st.nextToken())];
            for (int j = 0; j < arrays.length; j++) {
                arrays[j] = Integer.parseInt(st.nextToken());
            }
            long result = 0;

            for (int j = 0; j < arrays.length-1; j++) {
                for (int k = j+1; k < arrays.length; k++) {
                    result += gcd(arrays[j], arrays[k]);
                }
            }
            output.append(result).append("\n");
        }
        System.out.println(output);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
