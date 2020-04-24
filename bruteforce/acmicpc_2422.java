package bruteforce;

import java.util.Scanner;

public class acmicpc_2422 {
	static int [][] not;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] ice = new int [N+1];
		for (int i = 1; i < ice.length; i++) {
			ice[i] = i;
		}
		not = new int [N+1][N+1];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			not[a][b] = not[b][a] = 1;
		}
		int ans = 0;
		for (int i = 1; i <= N-2; i++) {
			for (int j = i+1; j <= N-1; j++) {
				for (int k = j+1; k <= N; k++) {
					if (not[i][j] == 1 || not[j][k] == 1 || not[k][i] == 1)continue;
					ans+=1;
				}
			}
		}
		System.out.println(ans);
	}
}
