import java.io.*;
import java.util.StringTokenizer;

/**
 * 1158번 요세푸스 문제
 * 메모리 : 20484 KB
 * 시간 : 236 ms
 * 코드 길이 : 1673 B
 *
 * @author 이태희
 * @see https://www.acmicpc.net/problem/1158
 */

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(tk.nextToken());
        int k = Integer.parseInt(tk.nextToken());

        Node head = new Node(1);

        if (n == 1){
            System.out.println("<1>");
        } else if (k == 1){
            sb.append("<");
            for (int i = 1; i < n; i++) {
                sb.append(i).append(", ");
            }
            sb.append(n).append(">");
            System.out.println(sb);
        } else {
            Node nextNode = head;
            for (int i = 2; i <= n; i++) {
                nextNode.next = new Node(i);
                nextNode = nextNode.next;
            }
            nextNode.next = head;
            sb.append("<");

            while (head.data != head.next.data){
                Node pred = head;
                for (int i = 1; i < k; i++) {
                    pred = head;
                    head = head.next;
                }
                sb.append(head.data).append(", ");
                pred.next = head.next;
                head = head.next;
            }
            sb.append(head.data).append(">");

            System.out.println(sb);
        }
    }
}

class Node{
    Node next;
    int data;

    public Node(){
        this.next = null;
        this.data = 0;
    }

    public Node(int data){
        this.next = null;
        this.data = data;
    }
}