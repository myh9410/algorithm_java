package dp;

import java.util.Arrays;
import java.util.Scanner;

public class acmicpc_11562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //건물의 수
		int m = sc.nextInt(); //길의 수
		final int M = 987654321;
		int [][] map = new int [n+1][n+1];
		
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map.length; j++) {
				if (i!=j) map[i][j] = M;
			}
		}
		
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v= sc.nextInt();
			int b = sc.nextInt();
			map[u][v] = 0;
			map[v][u] = (b==0?1:0); 
		}
		for (int k = 1; k < n+1; k++) {//경유 정점
			for (int i = 1; i < n+1; i++) {//출발 정점
				for (int j = 1; j < n+1; j++) {//도착 정점
					map[i][j] = Math.min(map[i][j], map[i][k]+map[k][j]);
				}
			}
		}
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			System.out.println(map[s][e]);
		}
		
	}
}
