package java_0128;

import java.util.Arrays;
import java.util.Scanner;

public class exercise2_sogum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc= sc.nextInt();
		int N = sc.nextInt();
		int sogum = sc.nextInt();
		int [][] pond = new int [N][N];
		int [] first_col = new int [sogum];
		int [] first_row = new int [sogum];
		int [] direction = new int [sogum];			
		for (int i = 0; i < sogum; i++) {
			first_col[i] = sc.nextInt();
			first_row[i] = sc.nextInt();
			direction[i] = sc.nextInt();
		}
		for (int i = 0; i < sogum; i++) {
			if (direction[i] == 1) {
				int pongdang = 3;
				int temp = first_col[i];
				while (pongdang > 0) {
					if (pond[temp-1][first_row[i]-1] > 0) {
						System.out.println(i);
						break;
					}
					if (pond[temp-1][first_row[i]-1] >=pond.length) {
						break;
					} else {
						pond[temp-1][first_row[i]-1]++;
						pongdang--;
						temp+=pongdang;
					}
				}
			} else {//direction[i]==2
				int pongdang = 3;
				int temp = first_row[i];
				while (pongdang > 0) {
					if (pond[temp-1][first_row[i]-1] > 0) {
						System.out.println(i);
						break;
					}
					if (pond[first_col[i]-1][temp-1] >=pond.length) {
						break;
					} else {
						pond[first_col[i]-1][temp-1]++;
						pongdang--;
						temp+=pongdang;
					}
				}
			}
		}
		for (int i = 0; i < direction.length; i++) {
			
		}
		
	}
}
