package math;

import java.util.Scanner;

public class acmicpc_1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		int [] dp = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		dp[0] = arr[0];
		for (int i = 1; i < dp.length; i++) {
			dp[i] = -1000;
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
			if (max <= dp[i]) max = dp[i];
		}
		System.out.println(max);
	}
}
