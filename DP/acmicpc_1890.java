package dp;

import java.util.Scanner;

public class acmicpc_1890 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] map = new int [n][n];
		long [][] dp = new long [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		dp[0][0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 0) continue;
				if (j+map[i][j] < n) 
					dp[i][j+map[i][j]] += dp[i][j];
				if (i+map[i][j] < n) 
					dp[i+map[i][j]][j] += dp[i][j];
			}
		}
		System.out.println(dp[n-1][n-1]);
	}//end main
}//end class
