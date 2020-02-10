import java.util.Scanner;

public class swea1861 {
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static int [][] room;
	static int [][] many;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			int N = sc.nextInt();
			room = new int [N][N];
			many = new int [N][N];
			for (int i = 0; i < room.length; i++) {
				for (int j = 0; j < room.length; j++) {
					room[i][j] = sc.nextInt();
				}
			}//입력
			
			for (int i = 0; i < many.length; i++) {
				for (int j = 0; j < many.length; j++) {
					int count = 1;
					search(i,j,i,j,room[i][j],count);
				}
			}
//			for (int i = 0; i < many.length; i++) {
//				System.out.println(Arrays.toString(many[i]));
//			}
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int loc = 0;
			for (int i = 0; i < many.length; i++) {
				for (int j = 0; j < many.length; j++) {
					if (many[i][j] >= max) {
						max = many[i][j];
					}
				}
			}
			for (int i = 0; i < many.length; i++) {
				for (int j = 0; j < many.length; j++) {
					if (many[i][j] == max && room[i][j] < min) {
						min = room[i][j];
					}
				}
			}
			System.out.println("#"+testcase+" "+min+" "+max);
		}//end tc
	}//end main
	public static void search(int x, int y,int kx,int ky,int val,int count) {
		boolean isThere = false;
		for (int k = 0; k < dx.length; k++) {
			int nx = kx + dx[k];
			int ny = ky + dy[k];
			if (nx < 0 || nx >= room.length || ny < 0 || ny >= room.length) continue;
			if (room[nx][ny] == room[kx][ky] + 1) {
				isThere = true;
				search(x,y,nx,ny,room[nx][ny],count+1);
			}
		}
		if (!isThere) {
			many[x][y] = count;
		}
	}
	
}//end class
