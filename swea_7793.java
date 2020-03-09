package ssafy_0309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class pointer{
	int x;
	int y;
	public pointer(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

//오! 나의 여신님
public class swea_7793 {
	static int N,M;
	static char [][] map;
	static int [][] visited;
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static Queue<pointer> sooyeon;
	static Queue<pointer> devil;
	static pointer angel;
	static int ans;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"");
		int T = Integer.parseInt(st.nextToken());
		for (int t = 1; t <= T; t++) {
			flag = false;
			sooyeon = new LinkedList<pointer>();
			devil = new LinkedList<pointer>();
			st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken()); 
			M = Integer.parseInt(st.nextToken());
			map = new char[N][M];
			visited = new int [N][M];
			for (int i = 0; i < N; i++) {
				String s = br.readLine();
				for (int j = 0; j < M; j++) {
					char c = s.charAt(j);
					if (c == 'S') {
						sooyeon.add(new pointer(i,j));
						visited[i][j] = 1;
					}
					else if (c=='D') angel = new pointer(i, j);
					else if (c == '*') devil.add(new pointer(i,j));
					map[i][j] = c;
				}
			}
			BFS();
			if (flag) System.out.println("#" + t +" " + ans);
			else System.out.println("#" + t +" " + "GAME OVER");
		}//end tc
	}//end main
	private static void BFS() {
		outerloop:while(true) {
			
			int slen = sooyeon.size();
			if (slen == 0) {
				break;
			}
			//수연이 이동
			for (int i = 0; i < slen; i++) {
				pointer s = sooyeon.poll();
				int x = s.x;
				int y = s.y;
				if (map[x][y] == '*') {
					flag = false;
					continue;
				}
				for (int j = 0; j < dx.length; j++) {
					int nx = x+dx[j];
					int ny = y+dy[j];
					if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
					if (map[nx][ny] == '.' && visited[nx][ny] == 0) {
						visited[nx][ny] = visited[x][y]+1;
						sooyeon.add(new pointer(nx,ny));
					}
					if (map[nx][ny] == 'D') {
						flag = true;
						ans = visited[x][y];
						break outerloop;
					}
				}
			}
			//악마 이동
			int dlen = devil.size();
			for (int i = 0; i < dlen; i++) {
				pointer d = devil.poll();
				int x = d.x;
				int y = d.y;
				for (int j = 0; j < dx.length; j++) {
					int nx = x+dx[j];
					int ny = y+dy[j];
					if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
					if (map[nx][ny] == '.' || map[nx][ny] == 'S') {
						map[nx][ny] = '*';
						devil.add(new pointer(nx,ny));
					}
				}
			}
//			for (int i = 0; i < map.length; i++) {
//				System.out.println(Arrays.toString(map[i]));
//			}
//			System.out.println();
//			for (int i = 0; i < visited.length; i++) {
//				System.out.println(Arrays.toString(visited[i]));
//			}
//			System.out.println("====================");
		}//end while
	}//end bfs
	
}//end class
