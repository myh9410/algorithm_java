import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_1210_Ladder1_D4_문용호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loc = 0;
		int val = 0;
		//배열 생성, 값 할당
		for (int t = 0; t < 10; t++) {
			int[][] a = new int[101][102];
			int testCase = sc.nextInt();
			for (int i = 100; i >= 1; i--) {
				for (int j = 1; j < 101; j++) {
					val = sc.nextInt();
					if (val == 2) {
						loc = j;
						a[i][j] = val;
					}else {						
						a[i][j] = val;
					}
				}
			}
			//출력
//			for (int i = 0; i < a.length; i++) {
//				System.out.println(Arrays.toString(a[i]));
//			}
			//탐색
			for (int r = 1; r <= 99; r++) {
				if (a[r][loc-1] == 1) {
					a[r][loc] = 0;
					loc = loc-1;
					r--;
				} else if (a[r][loc+1] == 1) {
					a[r][loc] = 0;
					loc = loc+1;
					r--;
				}
			}
			System.out.printf("#"+testCase+" "+(loc-1)+"\n");
		}
	}//eom
}//eoc