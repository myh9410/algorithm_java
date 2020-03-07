package dp;

import java.util.Scanner;

//�Ӹ����?
//D[i][j] = A[i]~A[j]������ �κ� ������ �Ӹ�����̸� : 1 �ƴϸ� : 0 �ʱⰪ�� -1
//D[i][i] = true
//D[i][i+1] ==> t/f
//	t : A[i] == A[i+1] 	f : A[i] != A[i+1]
//���̰� 3�̻��� ���� ��ͷ�
//i,j�� �˰����� ��
//A[i] == A[j]�̰�, D[i+1][j-1] == 1�� ��� �Ӹ����
//���� �̸� ���س���, ������ ������ ���� ã�⸸�ؼ� ��
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
