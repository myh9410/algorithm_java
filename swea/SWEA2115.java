package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA2115 {
	static int [][] map; // �Էµ� ���� ���� 
	static int [][] maxMap; // 	(i,j)��ġ���� ���� �� �ִ� �ִ�����
	static int N,M,C; // N:����ũ��, M:���ӵȹ����,C:ä�뷮
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
//		System.out.println(T);
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			map = new int [N][N];
			maxMap = new int [N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine()," ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());					
				}
			}//�Է� ��
			//1. �� i,j��ġ���� ���ӵ� M���� ����Ͽ� ���� �� �ִ� �κ������� �ִ������� ���
			makeMaxMap();
			//2. ���ϲ��� ����
			System.out.println("#"+t+" "+getMaxBenefit());
		}//end testcase
	}//end main
	public static void makeMaxMap() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N-M; j++) {//�迭�� ��踦 �Ű澲�� ���� �� ����
				makeMaxSubset(i, j, 0, 0, 0);
			}
		}
	}//end makeMaxMaps
	
	// i : �� ��ġ, j : �� ��ġ, cnt : ����� ���� �� 
	//sum :  �κ����տ� ���� ���ҵ��� ��, powSum : �κ����տ� ���� ������ ���Ͱ�
	public static void makeMaxSubset(int i,int j,int cnt,int sum, int powSum) {
		if (sum > C) return; // �κ������� ���� ��ǥ�� C�� �ʰ��ϸ� ����
		if (cnt == M) {
			if (maxMap[i][j-M]<powSum) {
				maxMap[i][j-M] = powSum;
			}
			return;
		}
		// i,j��ġ�� ���Ҹ� ����
		makeMaxSubset(i, j+1, cnt+1, sum+map[i][j], powSum+map[i][j]*map[i][j]);
		// i,j��ġ�� ���Ҹ� ����
		makeMaxSubset(i, j+1, cnt+1, sum, powSum);
		
	}
	
	public static int getMaxBenefit() {//������ �����
		int max = 0, temp = 0; //max : ������ ���� ���� �ִ����Ͱ�
		//1. �ϲ� A ���� ����
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N-M; j++) {
				//2. �ϲ� B ����
				//���� �� ����
				for (int j2 = j+M; j2 <= N-M; j2++) {
					temp = maxMap[i][j] + maxMap[i][j2]; // �� �ϲ� ������ �ִ밪 ���ϰ� �������ֱ�
					if (max < temp) {
						max = temp;
					}
				}
				// ��������� ����������� ����
				for (int i2 = i+1; i2 < N; i2++) {
					for (int j2 = 0; j2 <= N-M; j2++) {
						temp = maxMap[i][j] + maxMap[i2][j2];
						if (max < temp) {
							max = temp;
						}
					}
				}
				
			}
		}
		return max;
	}//end getMaxBenefit
}//end class
