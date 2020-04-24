package dp;

import java.util.Arrays;
import java.util.Scanner;

//1원 4원 6원으로 나눠줄때 거스름돈 갯수의 최소값
public class 플로이드워샬 {
	public static void main(String[] args) {
		final int M = Integer.MAX_VALUE; //연결이 안된경우는 무한대를 표시해주기 위한 M (큰 숫자 넣어주면 아래서 오버플로우 처리 안해줘도 됨)
		int [][] D = {{0,M,2,3},
						  {4,0,1,8},
						  {2,5,0,M},
						  {M,9,6,0}};
		
		for (int k = 0; k < D.length; k++) {//경유 정점
			for (int i = 0; i < D.length; i++) {//출발 정점
				if (k==i) continue; //D[i][i]는 어차피 0이므로 따로 처리 안해줘도 갱신 안됨
				for (int j = 0; j < D.length; j++) {//도착 정점
					if (k==j || i==j) continue; //마찬가지로 배열에서 어차피 값이 0이므로 갱신 안됨
					if (D[j][k] != M && D[k][j] != M && //Integer.MAX_VALUE 넘어가는것 체크 위함(오버플로우 대비) 
							D[i][j] > D[i][k] + D[k][j]) {
						D[i][j] = D[i][k]+D[k][j];
					}
				}
			}
		}
		
		for (int i = 0; i < D.length; i++) {
			System.out.println(Arrays.toString(D[i]));
		}
		
	}//end of main
}//end of class
