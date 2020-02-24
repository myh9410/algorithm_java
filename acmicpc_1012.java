package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Point{
	int x;
	int y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

public class acmicpc_1012 {
	static int [][] field;
	static int answer = 0;
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int T = Integer.parseInt(st.nextToken());
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine()," ");
			int M = Integer.parseInt(st.nextToken()); // 가로 
			int N = Integer.parseInt(st.nextToken()); // 세로 
			int K = Integer.parseInt(st.nextToken()); // 배추 갯수
			answer = 0;
			field = new int [N][M];
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				field[b][a] = 1;
			}
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[i].length; j++) {
					if (field[i][j] == 1) {
						search(i,j);
						answer++;
					}
				}
			}
		System.out.println(answer);
		}//end tc
	}//end main
	public static void search(int i, int j) {
		field[i][j] = 0;
		for (int k = 0; k < dx.length; k++) {
			int nx = i+dx[k];
			int ny = j+dy[k];
			if (nx < 0 || nx >=field.length || ny < 0 || ny >= field[i].length) continue;
			if (field[nx][ny] == 1) {
				search(nx,ny);
			}
		}
	}//end search
}//end class
