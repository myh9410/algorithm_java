package dp;

import java.util.Scanner;
//1,1���� �����ؼ� N,M�� �����ϴ� ���� �ִ밪�� ���ϴ� ����
//DP
//D[i][j] = 1,1���� �����ؼ� i,j�� �����ϴ� �� ����� �յ� ���� �ִ밪
//1. ������ �Ʒ��� �� ��� (i-1,j) ���� (i,j)�� >> i-1,j���� �ִ밪�� ������ �ְ�, map[i][j]���� �����ָ� ��
// �� D[i][j] = D[i-1][j] + map[i][j]
//2. ���ʿ��� ���������� �� ��� (i,j-1) ���� (i,j)�� >> i,j-1���� �ִ밪�� ������ �ְ�, map[i][j]���� �����ָ� ��
// �� D[i][j] = D[i][j-1] + map[i][j]
//3. �밢������ ���� �Ʒ��� �� ��� (i-1,j-1) ���� (i,j)�� >> i-1,j-1���� �ִ밪�� ������ �ְ�, map[i][j]���� �����ָ� ��
// �� D[i][j] = D[i-1][j-1] + map[i][j]
//���� 3���� ����߿� �ִ밪 >> max(D[i-1][j],D[i][j-1],D[i-1][j-1])+A[i][j]
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
		//0~N, 0~M �� ���, Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				//max3 : 3���� �ִ밪�� ���ϴ� �Լ�
				D[i][j] = max3(D[i-1][j],D[i][j-1],D[i-1][j-1])+map[i][j];
			}
		}
		System.out.println(D[N][M]);
	}
	private static int max3(int a,int b,int c) {
		return Math.max(Math.max(a,b),c);
	}
}//end class
