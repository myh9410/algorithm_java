package acmicpc;

import java.util.Scanner;

public class acmicpc_6064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			boolean ok = false;
			int ans = -1;
			for (int k=x; k < (N*M); k+=M) {
				if (k%N == y) {
					ans = k+1;
					break;
				}
			}
			if (ans >= 0) System.out.println(ans);
			else System.out.println(ans);
		}//end tc
	}//end main
}//end class
