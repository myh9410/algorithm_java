//백준 - 말이 되고픈 원숭이
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class acmicpc_1600 {
	static int [] horseX = {-1,1,0,0,-2,-2,-1,-1,1,1,2,2};
	static int [] horseY = {0,0,-1,1,-1,1,-2,2,-2,2,-1,1};
	static int K=0,W=0,H=0;
	static int [][] map;
	static boolean [][][] visited; 
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt();
		W = sc.nextInt();
		H = sc.nextInt();
		
		map = new int[H][W];
		visited = new boolean[H][W][31];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		visited[0][0][0] = true;
		solve();
	}//end main
	private static void solve() {
		Queue<Pos> queue = new LinkedList<Pos>();
		queue.add(new Pos(K, 0, 0, 0));
		while (!queue.isEmpty()) {
			Pos pos = queue.poll();
			if (pos.x == H-1 && pos.y == W-1) {
				System.out.println(pos.times);
				return;
			}
			if (pos.x < 0 || pos.x >= H || pos.y < 0 || pos.y >= W) continue;
			if (visited[pos.x][pos.y][pos.k]) continue;
			if (map[pos.x][pos.y] == 1) continue;
			visited[pos.x][pos.y][pos.k] = true;
			for (int i = 0; i < 4; i++) {
				int nx = pos.x + horseX[i];
				int ny = pos.y + horseY[i];				
				queue.add(new Pos(pos.k, nx, ny, pos.times+1));
			}
			if (pos.k == 0) continue;
			for (int j = 4; j < horseX.length; j++) {
				int nx = pos.x + horseX[j];
				int ny = pos.y + horseY[j];
				queue.add(new Pos(pos.k-1, nx, ny, pos.times+1));
			}
		}
		System.out.println(-1);
		return;
	}
}

class Pos{
	int k;
	int x;
	int y;
	int times;
	public Pos(int k, int x, int y,int times) {
		this.k = k;
		this.x = x;
		this.y = y;
		this.times = times;
	}
}
