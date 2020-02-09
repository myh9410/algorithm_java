package acmicpc;

import java.util.Scanner;

public class ·Î¶Ç6603 {
	static int N;
	static int [] a;
	static int [] res;
	public static void dfs(int s, int d) {
		if (d == 6) {
			print();
		} else {
			for (int i = s; i < N; i++) {
				res[i] = 1;
				dfs(i+1,d+1);
				res[i] = 0;
			}
		}
	}
	
	public static void print() {
		for (int i = 0; i < N; i++) {
			if (res[i] == 1) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String [] s = sc.nextLine().split(" ");
			N = Integer.parseInt(s[0]);
			if (N == 0) break;
			a = new int [N];
			res = new int [N];
			for (int i = 0; i < N; i++) {
				a[i] = Integer.parseInt(s[i+1]);
			}
			dfs(0,0);		
			System.out.println();
		}//end while
		
	}//end main
}//end class
