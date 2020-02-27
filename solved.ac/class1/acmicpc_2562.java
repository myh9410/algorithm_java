package solved_ac_Class1;

import java.util.Scanner;

public class acmicpc_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int idx = 1;
		int ans = 0;
		for (int i = 0; i < 9; i++) {
			int a = sc.nextInt();
			if (a > max) {
				max = a;
				ans = idx;
			}
			idx++;
		}
		System.out.println(max);
		System.out.println(ans);
	}
}
