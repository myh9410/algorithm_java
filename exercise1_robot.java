package java_0128;

import java.util.Arrays;
import java.util.Scanner;

public class exercise1_robot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int N = 0;
		char [][] arr = null;
		for (int i = 0; i < tc; i++) {
			N = sc.nextInt();
			arr = new char[N][N];
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					arr[j][k] = sc.next().charAt(0);
					//System.out.println(arr[j][k]);
				}
				//System.out.println();
			}
			int answer = 0;
			for (int a = 0; a < arr.length; a++) {
				for (int b = 0; b < arr[a].length; b++) {
					if (arr[a][b] == 'A') {
						for (int c = b+1; c < arr[a].length; c++) {//오른쪽 검사
							if (arr[a][c] == 'S') {
								answer++;
							} else if(arr[a][c] == 'W' || arr[a][c]=='A'
									|| arr[a][c] == 'B' || arr[a][c]=='C') {
								break;
							}
						}
					} else if (arr[a][b] == 'B') {
						for (int c = b+1; c < arr[a].length; c++) {//오른쪽 검사
							if (arr[a][c] == 'S') {
								answer++;
							} else if(arr[a][c] == 'W' || arr[a][c]=='A'
									|| arr[a][c] == 'B' || arr[a][c]=='C') {
								break;
							}
						}
						for (int c = b-1; c >= 0; c--) {//왼쪽 검사
							if (arr[a][c] == 'S') {
								answer++;
							} else if(arr[a][c] == 'W' || arr[a][c]=='A'
									|| arr[a][c] == 'B' || arr[a][c]=='C') {
								break;
							}
						}
					} else if (arr[a][b] == 'C') {
						for (int c = b+1; c < arr[a].length; c++) {//오른쪽 검사
							if (arr[a][c] == 'S') {
								answer++;
							} else if(arr[a][c] == 'W' || arr[a][c]=='A'
									|| arr[a][c] == 'B' || arr[a][c]=='C') {
								break;
							}
						}
						for (int c = b-1; c >= 0; c--) {//왼쪽 검사
							if (arr[a][c] == 'S') {
								answer++;
							} else if(arr[a][c] == 'W' || arr[a][c]=='A'
									|| arr[a][c] == 'B' || arr[a][c]=='C') {
								break;
							}
						}
						for (int c = a-1; c >=0; c--) {//위쪽 검사
							if (arr[a][c] == 'S') {
								answer++;
							} else if(arr[a][c] == 'W' || arr[a][c]=='A'
									|| arr[a][c] == 'B' || arr[a][c]=='C') {
								break;
							}
						}
					}
				}
			}
		}
	}
}
