package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class knight{
	int x;
	int y;
	int time;
	public knight (int x,int y,int time) {
		this.x = x;
		this.y = y;
		this.time = time;
	}
}

public class acmicpc_7562 {
	static int [] dx = {-1,-2,-2,-1,1,2,2,1};
	static int [] dy = {-2,-1,1,2,-2,-1,1,2};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int l = sc.nextInt();
			int [][] visited = new int [l][l];
			knight s = new knight(sc.nextInt(), sc.nextInt(),0);
			knight e = new knight(sc.nextInt(), sc.nextInt(),0);
			Queue<knight> q = new LinkedList<knight>();
			q.add(s);
			visited[s.x][s.y] = 1;
			while(!q.isEmpty()) {
				knight tmp = q.poll();
				if (tmp.x == e.x && tmp.y == e.y) {
					System.out.println(tmp.time);
					break;
				}
//				System.out.println(tmp.x+" "+tmp.y+" "+tmp.time);
				for (int i = 0; i < dx.length; i++) {
					int nx = tmp.x + dx[i];
					int ny = tmp.y + dy[i];
					if (nx < 0 || nx >= l || ny < 0 || ny >= l) continue;
					if (visited[nx][ny] == 0) {
						q.add(new knight(nx, ny, tmp.time+1) );
						visited[nx][ny] = 1;
					}
				}
//				System.out.println(q);
			}//end while
		}//end tc
	}//end main
}//end class
