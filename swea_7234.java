package List;

import java.util.Scanner;

public class swea_7234 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int [] dx = {-2,-1,2,1,0,0,0,0};
		int [] dy = {0,0,0,0,-2,-1,2,1};
		for (int t = 1; t <=tc; t++) {
			int N = sc.nextInt();
			int [][] map = new int [N+1][N+1];
			int B = sc.nextInt();
			int [] x = new int [B];
			int [] y = new int [B];
			for (int i = 0; i < B; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			int tmpx,tmpy;
			for (int i = 0; i < y.length; i++) {
				for (int j = 0; j < dy.length; j++) {
					tmpx = x[i]+dx[j];
					tmpy = y[i]+dy[j];
					if (tmpx >= map.length || tmpx < 0 || tmpy >= map.length || tmpy < 0) continue;
					else map[tmpx][tmpy]++;
				}
			}
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					if (map[i][j] == 0) continue;
					else if (max < map[i][j]) max = map[i][j];
				}
			}
			System.out.println("#"+t+" "+max);
		}//end tc
	}
}
