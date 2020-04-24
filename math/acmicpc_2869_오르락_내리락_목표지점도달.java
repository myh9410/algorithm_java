package math;

import java.util.Scanner;

public class acmicpc_2869_오르락_내리락_목표지점도달 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int interval = A-B;
		int tmp = V-A;
		int n = tmp/interval;
		if (interval*n >= tmp) System.out.println(n+1);
		else System.out.println(n+2);
		sc.close();
	}
}
