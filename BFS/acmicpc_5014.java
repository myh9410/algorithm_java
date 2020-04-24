package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class acmicpc_5014 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		Queue<Integer> q = new LinkedList<Integer>();
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		boolean [] visited = new boolean [F+1];
		q.add(S);
		q.add(Integer.MIN_VALUE);
		visited[S] = true;
		int cnt = 0;
		boolean checker = false;
		while(!q.isEmpty()) {
			int cur = q.poll();
			if (cur == G) break;
			if (cur == Integer.MIN_VALUE && q.size() != 0) {
				cnt++;
				q.add(Integer.MIN_VALUE);
				continue;
			} else if (cur == Integer.MIN_VALUE && q.size() == 0) {
				checker = true;
				System.out.println("use the stairs");
				break;
			}
			if ((cur+U)<=F && !visited[cur+U]) {
				q.add(cur+U);
				visited[cur+U] = true;
			}
			if ((cur-D)>= 1 && !visited[cur-D]) {
				q.add(cur-D);
				visited[cur-D] = true;
			}
		}
		if (!checker) System.out.println(cnt);
	}
}
