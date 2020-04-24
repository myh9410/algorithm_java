package acmicpc;

import java.util.Scanner;

public class acmicpc_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int e = N/H+1;
			int s = N%H;
			if (s == 0) {
				e = N/H;
				s = H;
			}
			System.out.println(s*100+e);
		}//tc
		sc.close();
	}//main
}//class
