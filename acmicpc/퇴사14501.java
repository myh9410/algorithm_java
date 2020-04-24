package acmicpc;

import java.util.Arrays;
import java.util.Scanner;

public class 퇴사14501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] t = new int [N+1];
		int [] p = new int [N+1];
		int [] dp = new int [N+2];
		for (int i = 1; i <= N; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		
		for (int i = N; i >0; i--) {
			int d = i + t[i];
			if (d <= N+1) {
				dp[i] = Math.max(p[i] + dp[d],dp[i+1]);
			} else {
				dp[i] = dp[i+1];
			}
		}//end for
		System.out.println(Arrays.toString(dp));
		System.out.println(dp[1]);
		
	}// end main
}//end class
