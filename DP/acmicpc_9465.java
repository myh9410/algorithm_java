package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class acmicpc_9465 {
	static long [][] sticker;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			int n = Integer.parseInt(br.readLine());
			sticker = new long [n+1][2];
			{
				String [] line = br.readLine().split(" ");
				for (int i = 1; i <= n; i++) {
					sticker[i][0] = Long.valueOf(line[i-1]);
				}
			}
			{
				String [] line = br.readLine().split(" ");
				for (int i = 1; i <= n; i++) {
					sticker[i][1] = Long.valueOf(line[i-1]);
				}
			}
			long [][] dp = new long[n+1][3];
			for (int i = 1; i <= n; i++) {
				dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
				dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2])+sticker[i][0];
				dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1])+sticker[i][1];
			}
			long ans = Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2]));
			System.out.println(ans);
			
		}//end tc
	}//end main
}//end class
