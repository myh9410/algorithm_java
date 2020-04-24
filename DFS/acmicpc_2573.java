package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class iceburg {
	int x;
	int y;
	int cnt;
	public iceburg(int x, int y, int cnt) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}

public class acmicpc_2573 {
	static int [][] map;
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static int N,M;
	static boolean bfs_checker;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int year = 0;
		while(true) {
			year++;
			BFS();
			if (bfs_checker) {
				System.out.println(0);
				break;
			}
			boolean check = DFS();
			if (!check) {
				System.out.println(year);
				break;
			}
		}
		
	}//end main
	private static boolean DFS() {
		int [][] visited = new int[N][M];
		outloop:for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] != 0) {
					Stack<iceburg> s = new Stack<iceburg>();
					s.add(new iceburg(i, j, map[i][j]));
					visited[i][j] = 1;
					while(!s.isEmpty()) {
						iceburg ice = s.pop();
						for (int k = 0; k < dx.length; k++) {
							int nx = ice.x +dx[k];
							int ny = ice.y +dy[k];
							if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
							if (map[nx][ny] != 0 && visited[nx][ny] == 0) {
								s.add(new iceburg(nx, ny, map[nx][ny]));
								visited[nx][ny] = 1;
							}
						}
					}//end while
					break outloop;
				}	
			}
		}
		boolean check = true;
		outloop:for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (visited[i][j] == 0 && map[i][j] != 0) {
					check = false;
					break outloop;
				}
			}
		}
		return check;
	}//end dfs
	private static void BFS() {
		Queue<iceburg> q = new LinkedList<iceburg>();
		bfs_checker = true;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] != 0) {
					bfs_checker = false;
					int cnt = 0;
					for (int k = 0; k < dx.length; k++) {
						int nx = i+dx[k];
						int ny = j+dy[k];
						if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
						if (map[nx][ny] == 0) cnt++;
					}
					if (cnt > map[i][j]) cnt = map[i][j];
					q.add(new iceburg(i, j, cnt));
				}
			}
		}
		for (iceburg i : q) {
			map[i.x][i.y] -= i.cnt;
		}
	}//end bfs
}//end class
