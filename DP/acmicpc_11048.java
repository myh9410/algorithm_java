package acmicpc;

import java.util.Scanner;
//1,1에서 시작해서 N,M에 도착하는 합의 최대값을 구하는 문제
//DP
//D[i][j] = 1,1에서 시작해서 i,j에 도착하는 각 방법의 합들 중의 최대값
//1. 위에서 아래로 온 경우 (i-1,j) 에서 (i,j)로 >> i-1,j까지 최대값을 가지고 있고, map[i][j]값만 더해주면 됨
// 즉 D[i][j] = D[i-1][j] + map[i][j]
//2. 왼쪽에서 오른쪽으로 온 경우 (i,j-1) 에서 (i,j)로 >> i,j-1까지 최대값을 가지고 있고, map[i][j]값만 더해주면 됨
// 즉 D[i][j] = D[i][j-1] + map[i][j]
//3. 대각선에서 우측 아래로 온 경우 (i-1,j-1) 에서 (i,j)로 >> i-1,j-1까지 최대값을 가지고 있고, map[i][j]값만 더해주면 됨
// 즉 D[i][j] = D[i-1][j-1] + map[i][j]
//위의 3가지 경우중에 최대값 >> max(D[i-1][j],D[i][j-1],D[i-1][j-1])+A[i][j]
public class acmicpc_11048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [][] map = new int [N+1][M+1];
		int [][] D = new int [N+1][M+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		//0~N, 0~M 일 경우, Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				//max3 : 3수의 최대값을 구하는 함수
				D[i][j] = max3(D[i-1][j],D[i][j-1],D[i-1][j-1])+map[i][j];
			}
		}
		System.out.println(D[N][M]);
	}
	private static int max3(int a,int b,int c) {
		return Math.max(Math.max(a,b),c);
	}
}//end class
