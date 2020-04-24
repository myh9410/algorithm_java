package acmicpc;

import java.util.Arrays;
import java.util.Scanner;

public class 토마토7576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] dx = {-1,1,0,0};
		int [] dy = {0,0,-1,1};		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int [][] box = new int [N][M];
		boolean [][] check = new boolean [N][M];
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				int start = sc.nextInt();
				if (start == 1) check[i][j] = true;
				box[i][j] = start; 
			}
		}
		int count = 0;
		//1�� ����, 0�� ���� ����, -1�� ����
		while (true) {
			int sum1 =0;
			int sum2 =0;
			for (int i = 0; i < box.length; i++) {
				for (int j = 0; j < box[i].length; j++) {
					if (box[i][j] ==1) {
						sum1++;
						sum2++;
					}
				}
			}
			
			for (int i = 0; i < box.length; i++) {
				for (int j = 0; j < box[i].length; j++) {
					if (box[i][j] == 1 && check[i][j] == true) {						
						for (int k = 0; k < dx.length; k++) {
							int x = i+dx[k]; 
							int y = j+dy[k];
							if (x < 0 || x >= box.length || y < 0 || y >= box[i].length) continue;
							if (box[x][y] == 0 && check[x][y] == false) {
								box[x][y] = 1;
							}
							//�� ó�� 1 ���� ��� ã��
						}//end for bfs
					}//end if
				}//end for y
			}//end for x
			//checker�迭 true��
			for (int i = 0; i < check.length; i++) {
				for (int j = 0; j < check[i].length; j++) {
					if (box[i][j] == 1 && check[i][j] == false) {
						check[i][j] = true;
						sum2++;
					}
				}
			}
//			for (int i = 0; i < box.length; i++) {
//				System.out.println(Arrays.toString(box[i]));
//			}
//			System.out.println();
			if (sum1 == sum2) break;
			count++;
		}//end while
		//�迭�� 0 ���Ҵ��� Ȯ��
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				if (box[i][j] == 0) {
					count = -1;
					break;
				}
			}
			if (count == -1) break;
		}
		System.out.println(count);
	}
}
