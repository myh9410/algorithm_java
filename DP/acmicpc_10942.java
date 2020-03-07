package dp;

import java.util.Scanner;

//팰린드롬?
//D[i][j] = A[i]~A[j]까지의 부분 수열이 팰린드롬이면 : 1 아니면 : 0 초기값은 -1
//D[i][i] = true
//D[i][i+1] ==> t/f
//	t : A[i] == A[i+1] 	f : A[i] != A[i+1]
//길이가 3이상인 경우는 재귀로
//i,j를 알고있을 때
//A[i] == A[j]이고, D[i+1][j-1] == 1인 경우 팰린드롬
//답을 미리 구해놓고, 질문이 들어오면 답을 찾기만해서 줌
public class acmicpc_10942 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N+1];
		boolean [][] DP = new boolean [N][N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			DP[i][i] = true;
		}
		for (int i = 0; i < N-1; i++) {
			if (arr[i] == arr[i+1]) DP[i][i+1] = true;
		}
		for (int i = 2; i < N; i++) {
			for (int j = 0; j < N-i; j++) {
				int k = i+j;
				if (arr[j] == arr[k] && DP[j+1][k-1]) {
					DP[j][k] = true;
				}
			}
		}
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			if (DP[s-1][e-1]) System.out.println(1);
			else System.out.println(0);
		}
	}
}
