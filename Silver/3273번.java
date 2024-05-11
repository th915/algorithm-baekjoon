import java.io.*;
import java.util.StringTokenizer;

/**
 * 3273번 두 수의 합
 * 메모리 : 28324 KB
 * 시간 : 308 ms
 * 코드 길이 : 855 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/3273
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int[] arrays = new int[1000001];
        int count = 0;

        if (n == 1 && Integer.parseInt(tk.nextToken()) == x){
            count++;
        }

        while(tk.hasMoreTokens()){
            int number = Integer.parseInt(tk.nextToken());
            int sub = x - number;
            if (sub <= 1000000 && sub >= 0 && arrays[sub] != 0){
                count++;
            }
            arrays[number]++;
        }
        System.out.println(count);
    }
}