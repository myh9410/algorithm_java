package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class acmicpc_9205 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= T; t++) {
			boolean success = false;
			int n = Integer.parseInt(br.readLine());//ÆíÀÇÁ¡ °¹¼ö
			int [][] nodes = new int[n+2][2];
			int [] check = new int[n+2];
			for (int i = 0; i < n+2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				nodes[i][0] = Integer.parseInt(st.nextToken());
				nodes[i][1] = Integer.parseInt(st.nextToken());
			}
			Queue<int []> q = new LinkedList<int[]>();
			q.add(nodes[0]);
			while(!q.isEmpty()) {
				int [] cur = q.poll();
				int x = cur[0];
				int y = cur[1];
				if (x == nodes[n+1][0] && y==nodes[n+1][1]) {
					success = true;
					break;
				}
				for (int i = 1; i < n+2; i++) {
					if (check[i] == 0 && (Math.abs(x - nodes[i][0]) +Math.abs(y - nodes[i][1]) <= 1000)) {
						q.add(nodes[i]);
						check[i] = 1;
					}
				}
			}
			if (success) {
				sb.append("happy"+"\n");
			} else {
				sb.append("sad"+"\n");
			}
		}//end tc
		System.out.println(sb.toString());
	}//end main
}//end class
