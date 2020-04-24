package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//���ݸ��� ������
//Ÿ�ӿ���
public class swea9282_memoization {
	static int [][] map;
	static int [][][][] dp; // x,y,����,���̸� �������� dp�迭
	static int result;
	static int n,m;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			map = new int [n][m];
			dp = new int [n+1][m+1][n+1][m+1];
			for (int[][][] d1 : dp) {
				for (int [][] d2 : d1) {
					for (int [] d3 : d2) {
						Arrays.fill(d3, Integer.MAX_VALUE);
					}
				}
			}
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int idx = 0;
				while(st.hasMoreTokens()) {
					map[i][idx++] = Integer.parseInt(st.nextToken());
				}
			}
			result = dfs(0,0,n,m);
			System.out.println("#"+t+" "+result);
		}//end tc
	}//end main
	private static int dfs(int y, int x, int h, int w) {
		if (w == 1 && h == 1) {
			return 0;
		}
		if (dp[y][x][h][w] != Integer.MAX_VALUE) {
			return dp[y][x][h][w]; 
		}
		//������ �ִ� ����� ������ ������ŭ ������ ����
		int sum = 0;
		for (int i = y; i < y+h; i++) {
			for (int j = x; j < x+w; j++) {
				sum+=map[i][j];
			}
		}
		//���η� ������ �ּҺ���� ���Ѵ�
		for (int i = 1; i < h; i++) {
			//���ʺ��
			//����ġ��
			if (dp[y][x][i][w] == Integer.MAX_VALUE)
				dp[y][x][i][w] = dfs(y,x,i,w);
			//�Ʒ��ʺ��
			if (dp[y+i][x][h-i][w] == Integer.MAX_VALUE)
				dp[y+i][x][h-i][w] = dfs(y+i,x,h-i,w);
			//�� ������ ��
			int sum3 = sum+dp[y][x][i][w]+dp[y+i][x][h-i][w];
			dp[y][x][h][w] = Math.min(dp[y][x][h][w], sum3);
		}
		//���η� ������ �ּҺ���� ���Ѵ�.
		for (int i = 1; i < w; i++) {
			//���� ���
			if (dp[y][x][h][i] == Integer.MAX_VALUE)
				dp[y][x][h][i] = dfs(y,x,h,i);
			//������ ���
			if (dp[y][x+i][h][w-i] == Integer.MAX_VALUE)
				dp[y][x+i][h][w-i] = dfs(y,x+i,h,w-i);
			int sum3 = sum+dp[y][x][h][i]+dp[y][x+i][h][w-i];
			dp[y][x][h][w] = Math.min(dp[y][x][h][w], sum3);
		}
		return dp[y][x][h][w];
	}//end dfs
}//end class
