import java.util.*;
import java.io.*;

/**
 * 2493번 탑
 * 메모리 : 87276 KB
 * 시간 : 704 ms
 * 코드 길이 : 1169 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/2493
 */

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer tk = new StringTokenizer(br.readLine());
        Deque<Laser> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(tk.nextToken());
            while (!stack.isEmpty()){
                int tmp = stack.peek().num;
                if (tmp >= x){
                    sb.append(stack.peek().index).append(" ");
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()){
                sb.append(0).append(" ");
            }
            stack.push(new Laser(x, i+1));

        }
        System.out.println(sb);
    }
}

class Laser{
    public int num;
    public int index;

    public Laser(){
    }

    public Laser(int num, int index){
        this.num = num;
        this.index = index;
    }
}
