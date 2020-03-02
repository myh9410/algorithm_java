package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class vector{
	int x;
	int y;
	public vector(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

public class acmicpc_10026 {
	static char [][] map;
	static int [][] visited;
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static int N;
	static Queue<vector> q;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		map = new char[N][N];
		visited = new int[N][N];
		for (int i = 0; i < map.length; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < map.length; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		int b1=0,b2=0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (visited[i][j] ==0) {
					q = new LinkedList<vector>();
					q.add(new vector(i, j));
					bfs1(i,j,map[i][j]);
					b1++;
				}
			}
		}
		visited = new int[N][N];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (visited[i][j] ==0) {
					q = new LinkedList<vector>();
					q.add(new vector(i, j));
					bfs2(i,j,map[i][j]);
					b2++;
				}
			}
		}
		System.out.println(b1 +" "+b2);
		//82 - R	//71 - G //66 - B
	}//end main
	private static void bfs1(int i, int j, char c) {//적록색약이 아닌 사람
		while(!q.isEmpty()) {
			vector v = q.poll();
			for (int k = 0; k < dx.length; k++) {
				int nx = v.x+dx[k];
				int ny = v.y+dy[k];
				if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
				if (map[nx][ny] == c && visited[nx][ny] == 0)  {
					visited[nx][ny] = 1;
					q.add(new vector(nx, ny));
				}
			}
		}//end while
	}
	private static void bfs2(int i, int j, char c) {//적록색약인 사람
		while(!q.isEmpty()) {
			vector v = q.poll();
			for (int k = 0; k < dx.length; k++) {
				int nx = v.x+dx[k];
				int ny = v.y+dy[k];
				if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
				if (c == 'B') {
					if (map[nx][ny] == c && visited[nx][ny] == 0)  {
						visited[nx][ny] = 1;
						q.add(new vector(nx, ny));
					}
				} else {
					if ((map[nx][ny] == 'R' || map[nx][ny] == 'G') && visited[nx][ny] == 0)  {
						visited[nx][ny] = 1;
						q.add(new vector(nx, ny));
					}
				}
			}
		}//end while
	}
}//end class
