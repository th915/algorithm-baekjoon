import java.io.*;

/**
 * 1475번 방 번호
 * 메모리 : 14300 KB
 * 시간 : 124 ms
 * 코드 길이 : 640 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/3273
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] number = new int[10];

        while(n > 0){
            number[n % 10]++;
            n /= 10;
        }

        int x = number[6] + number[9];
        number[6] = x - (x / 2);

        int max = 0;
        for (int i = 0; i < 9; i++) {
            int tmp = number[i];
            if (tmp > max){
                max = tmp;
            }
        }

        System.out.println(max);
    }
}