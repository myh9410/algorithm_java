package solved.ac_class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class acmicpc_2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		while(q.size() > 1) {
			q.poll();
			int tmp = q.poll();
			q.add(tmp);
		}
		int ans = q.poll();
		System.out.println(ans);
	}
}
