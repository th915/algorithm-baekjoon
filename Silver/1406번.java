import java.io.*;
import java.util.*;

/**
 * 1406번 에디터
 * 메모리 : 73232 KB
 * 시간 : 548 ms
 * 코드 길이 : 1614 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/1406
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            leftStack.push(ch);
        }

        for (int i = 0; i < count; i++) {
            String command = br.readLine();
            char action = command.charAt(0);

            switch (action) {
                case 'L':
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case 'D':
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case 'B':
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                case 'P':
                    char ch = command.charAt(2);
                    leftStack.push(ch);
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        System.out.println(sb);
    }
}
