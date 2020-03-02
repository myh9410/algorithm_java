package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pointer{
	int x;
	int y;
	public pointer(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

public class acmicpc_2468 {
	static int [][] map;
	static int [][] tmpMap;
	static int [] height = new int [101];
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static int N;
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int [N][N];
		tmpMap = new int [N][N];
		int ans = 1;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				int tmp = sc.nextInt();
				if (max < tmp) max = tmp;
				if (height[tmp] == 0) height[tmp] = 1;
				map[i][j] = tmp;
			}
		}
		for (int i = 0; i <= max; i++) {
			if (height[i] != 0) {
				for (int j = 0; j < tmpMap.length; j++) {
					for (int k = 0; k < tmpMap.length; k++) {
						tmpMap[j][k] = map[j][k] - i;
					}
				}
				//물에 잠기는 경우들을 만들어 줘서 tmpMap이라는 배열에 저장해줬음
				search();
				if (ans < count) ans = count;
			}
		}
		System.out.println(ans);
	}//end main
	private static void search() {
		int [][] visited = new int [N][N];
		count = 0;
		for (int i = 0; i < tmpMap.length; i++) {
			for (int j = 0; j < tmpMap.length; j++) {
				if (tmpMap[i][j] > 0 && visited[i][j] == 0) {
					Queue<pointer> q = new LinkedList<pointer>();
					visited[i][j] = 1;
					q.add(new pointer(i, j));
					while (!q.isEmpty()) {
						pointer p = q.poll();
						for (int k = 0; k < dx.length; k++) {
							int nx = p.x+dx[k];
							int ny = p.y+dy[k];
							if (nx < 0 || nx >= tmpMap.length || ny < 0 || ny >= tmpMap.length) continue;
							if (tmpMap[nx][ny] > 0 && visited[nx][ny] == 0) {
								visited[nx][ny] = 1;
								q.add(new pointer(nx, ny));
							}
						}
					}//end while(!q.isEmpty())
					count++;
				}
			}//end inner for
		}//end outer for
	}//end search
}//end class
