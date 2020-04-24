package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea1808 {
	static int [] check;
	static int [] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			check = new int [10];
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int idx = 0;
			while(st.hasMoreTokens()) {
				int val = Integer.parseInt(st.nextToken());
				check[idx++] = val;
			}
			st = new StringTokenizer(br.readLine(),"");
			int N = Integer.parseInt(st.nextToken());//이동하고자하는 채널
			dp = new int [N+10];
			for (int i = 0; i < 10; i++) {
				if (check[i] == 1) dp[i] = 1;
			}
			run(N);
			if (dp[N] == Integer.MAX_VALUE) System.out.println("#"+t+" "+(-1));
			else System.out.println("#"+t+" "+(dp[N]+1));
		}
	}//end main
	private static int run(int N) {
		if(dp[N] != 0) return dp[N];
		
		dp[N] = possible(N);
		
		for (int i = 1; i <= (int)Math.sqrt(N); i++) {
			if (N%i == 0) {
				int num1 = possible(i);
				int num2 = possible(N/i);
				dp[N] = Math.min(dp[N], num1 == Integer.MAX_VALUE || num2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : num1+num2 + 1);
			}
		}
		return dp[N];
	}
	private static int possible(int c) {
		int len = 0;
		while (c > 0) {
			if (check[c%10] == 1) {
				len += 1;
				c /= 10;
			}
			else return Integer.MAX_VALUE;
		}
		return len;
	}
}
