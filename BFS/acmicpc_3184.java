package BFS;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class acmicpc_3184 {
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static boolean[][] visited;
	static Queue<Point> list;
	static int wolf=0,sheep=0;//bfs 늑대, 양
	static int aw=0, as=0; //정답 늑대, 양
	static int N=0,M=0;
	static char [][] map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char [N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		list = new LinkedList<Point>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 'v' && !visited[i][j]) {
//					System.out.println("늑대 : "+i+" "+j);
					wolf=0; 	sheep=0; list.clear();
					visited[i][j] = true;
					list.add(new Point(i, j));
					wolf++;
					BFS();
				} else if (map[i][j] == 'o' && !visited[i][j]) {
//					System.out.println("양 : "+i+" "+j);
					wolf=0; 	sheep=0; list.clear();
					visited[i][j] = true;
					list.add(new Point(i, j));
					sheep++;
					BFS();
				}
			}
		}
		System.out.println(as+" "+aw);
	}
	private static void BFS() {
		while (!list.isEmpty()) {
			Point p = list.poll();
			int x = p.x;
			int y = p.y;
			for (int i = 0; i < dx.length; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if (nx <0 || nx >= N || ny<0 || ny >= M) continue;
				if (map[nx][ny] != '#' && !visited[nx][ny]) {
					if (map[nx][ny] == 'v') wolf++;
					if (map[nx][ny] == 'o') sheep++;
					visited[nx][ny] = true;
					list.add(new Point(nx, ny));
					
				}
			}
		}
		if (wolf >= sheep) aw+=wolf;
		else as+=sheep;
	}
}
