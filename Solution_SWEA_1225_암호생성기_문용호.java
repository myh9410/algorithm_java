import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_SWEA_1225_암호생성기_문용호 {
	// 1. 자료구조 선택
	// 2. 최악의 경우, 최소의 경우를 체크해보자 ( 다 21억쯤이 들어있다면? )
	// 3. 다른 풀이 접근법 : 배열의 가장 최솟값 기준으로 15로 나눠줘서 나머지를 구하고 거기서 루프를 돌리면 더 빠름
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int tc;
		for (int t = 1; t <=10 ; t++) {
			tc = sc.nextInt();
			for (int i = 0; i < 8; i++) {
				int tmp = sc.nextInt();
				q.offer(tmp);
			}
			int val = 1;
			while (true) {
				int q_val = q.poll();
				q_val-=val;
				if (q_val <=0) {
					q_val = 0;
					q.offer(q_val);
					break;
				} else {
					if (val == 5) val = 1;
					else val++;
					q.offer(q_val);
				}
			}
			System.out.print("#"+tc + " ");
			for (int i = 0; i < 8; i++) {
				if (i == 7) System.out.print(q.poll());
				else System.out.print(q.poll()+" ");				
			}
			System.out.println();
		}//end tc
	}//end main
}//end class
