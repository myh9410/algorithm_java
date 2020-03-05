package solved.ac_class3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class acmicpc_11279 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> pq =new PriorityQueue<>(N, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		for (int i = 0; i < N; i++) {
			int tmp =sc.nextInt();
			if (tmp == 0 && pq.size() == 0) System.out.println(0);
			else if (tmp == 0 && pq.size() != 0) System.out.println(pq.poll());
			else pq.add(tmp);
		}
	}
}
