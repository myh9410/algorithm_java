package acmicpc;

import java.util.Scanner;

public class acmicpc_1633 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] score = new int [1004][2];
		int [][][] dp = new int [1004][17][17];
		int n = 1;
		while (sc.hasNextInt()) {
			score[n][0] = sc.nextInt();
			score[n++][1] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < n; i++) {
			dp[i][0][1] = score[i][1];
			dp[i][1][0] = score[i][0];
		}
		for (int i = 1; i < n; i++) {
			for (int j = 15; j >=0; j--) {
				for (int k = 15; k >=0; k--) {
					dp[i][j][k] = Math.max(dp[i][j][k],dp[i-1][j][k]);
					if (j >=1) dp[i][j][k] = Math.max(dp[i-1][j-1][k]+score[i][0],dp[i][j][k]);
					if (k >=1) dp[i][j][k] = Math.max(dp[i-1][j][k-1]+score[i][1],dp[i][j][k]);
				}
			}
		}
		System.out.println(dp[n-1][15][15]);
	}//end main
}//end class
