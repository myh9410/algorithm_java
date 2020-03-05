package solved.ac_class2;

import java.util.Scanner;

public class acmicpc_1018 {
	static char [][] checker1 = {
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},					
	};
	static char [][] checker2 = {
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},					
			{'W','B','W','B','W','B','W','B'},
	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		char [][] map = new char [N][M];
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N-checker1.length+1; i++) {
			for (int j = 0; j < M-checker1.length+1; j++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for (int k = 0; k < 8; k++) {
					for (int l = 0; l < 8; l++) {
						if (checker1[k][l] != map[i+k][j+l]) cnt1++;
						if (checker2[k][l] != map[i+k][j+l]) cnt2++;
					}
				}
				if (cnt1 < min) min = cnt1;
				if (cnt2 < min) min = cnt2;
			}
		}
		System.out.println(min);
	}//end main
}//end calss
