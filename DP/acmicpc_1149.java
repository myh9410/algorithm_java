package dp;

import java.util.Scanner;

public class acmicpc_1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] dp = new int [N][3];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = sc.nextInt();
			dp[i][1] = sc.nextInt();
			dp[i][2] = sc.nextInt();
		}
		for (int i = 1; i < dp.length; i++) {
			int tmp0 = dp[i][0];
			int tmp1 = dp[i][1];
			int tmp2 = dp[i][2];
			dp[i][0] = Math.min(dp[i-1][2]+tmp0, dp[i-1][1]+tmp0);
			dp[i][1] = Math.min(dp[i-1][0]+tmp1, dp[i-1][2]+tmp1);
			dp[i][2] = Math.min(dp[i-1][0]+tmp2, dp[i-1][1]+tmp2);
		}
		
		System.out.println(Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2])));
		
	}
}
