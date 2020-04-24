package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA2115 {
	static int [][] map; // 입력된 벌통 정보 
	static int [][] maxMap; // 	(i,j)위치에서 가질 수 있는 최대이익
	static int N,M,C; // N:벌통크기, M:연속된벌통수,C:채취량
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
			}//입력 끝
			//1. 각 i,j위치에서 연속된 M개를 고려하여 취할 수 있는 부분지합의 최대이익을 계산
			makeMaxMap();
			//2. 두일꾼의 조합
			System.out.println("#"+t+" "+getMaxBenefit());
		}//end testcase
	}//end main
	public static void makeMaxMap() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N-M; j++) {//배열의 경계를 신경쓰지 않을 수 있음
				makeMaxSubset(i, j, 0, 0, 0);
			}
		}
	}//end makeMaxMaps
	
	// i : 행 위치, j : 열 위치, cnt : 고려한 원소 수 
	//sum :  부분집합에 속한 원소들의 합, powSum : 부분집합에 속한 원소의 이익값
	public static void makeMaxSubset(int i,int j,int cnt,int sum, int powSum) {
		if (sum > C) return; // 부분집합의 합이 목표량 C를 초과하멸 리턴
		if (cnt == M) {
			if (maxMap[i][j-M]<powSum) {
				maxMap[i][j-M] = powSum;
			}
			return;
		}
		// i,j위치의 원소를 선택
		makeMaxSubset(i, j+1, cnt+1, sum+map[i][j], powSum+map[i][j]*map[i][j]);
		// i,j위치의 원소를 비선택
		makeMaxSubset(i, j+1, cnt+1, sum, powSum);
		
	}
	
	public static int getMaxBenefit() {//조합을 만들기
		int max = 0, temp = 0; //max : 조합적 선택 후의 최대이익값
		//1. 일꾼 A 기준 선택
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N-M; j++) {
				//2. 일꾼 B 선택
				//같은 행 기준
				for (int j2 = j+M; j2 <= N-M; j2++) {
					temp = maxMap[i][j] + maxMap[i][j2]; // 두 일꾼 조합의 최대값 구하고 갱신해주기
					if (max < temp) {
						max = temp;
					}
				}
				// 다음행부터 마지막행까지 선택
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
