package solved.ac_class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class acmicpc_10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String s = st.nextToken();
			if (s.equals("push_back")) {
				deque.offerLast(Integer.parseInt(st.nextToken()));
			} else if (s.equals("push_front")) {
				deque.offerFirst(Integer.parseInt(st.nextToken()));				
			} else if (s.equals("pop_front")) {
				if (deque.size() == 0) sb.append("-1\n");
				else sb.append(deque.pollFirst()+"\n");
			} else if (s.equals("pop_back")) {
				if (deque.size() == 0) sb.append("-1\n");
				else sb.append(deque.pollLast()+"\n");
			} else if (s.equals("size")) {
				sb.append(deque.size()+"\n");
			} else if (s.equals("empty")) {
				if (deque.size() == 0) sb.append("1\n");
				else sb.append("0\n");
			} else if (s.equals("front")) {
				if (deque.size() == 0) sb.append("-1\n");
				else sb.append(deque.peekFirst()+"\n");
			} else if (s.equals("back")) {
				if (deque.size() == 0) sb.append("-1\n");
				else sb.append(deque.peekLast()+"\n");
			}
		}
		System.out.println(sb.toString());
	}
}
