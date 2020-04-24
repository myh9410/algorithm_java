package swea;

import java.util.Scanner;

public class swea_7699 {
	static char [][] map;
	static int [] visited;
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static int R,C;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			R = sc.nextInt();
			C = sc.nextInt();
			sc.nextLine();
			map = new char [R][C];
			visited = new int [26];
			for (int i = 0; i < R; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < C; j++) {
					map[i][j] = s.charAt(j);
				}
			}
			count=0;
			DFS(0,0,1);
			System.out.println("#"+t+" "+count);
		}//end tc
	}//end main
	private static void DFS(int i, int j,int d) {
		visited[map[i][j]-'A'] = 1;
		for (int k = 0; k < dx.length; k++) {
			int nx = i + dx[k];
			int ny = j + dy[k];
			if (nx < 0 || nx >= R || ny < 0 || ny >= C) continue;
			if (visited[map[nx][ny]-'A'] == 0) {
				DFS(nx,ny,d+1);
			}
		}//end for
		visited[map[i][j]-'A'] = 0;
		count = Math.max(count, d);
	}//end dfs
}//end class
