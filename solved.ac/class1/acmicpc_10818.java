package solved_ac_Class1;

import java.util.Scanner;

public class acmicpc_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			if (tmp > max) max = tmp;
			if (tmp < min) min = tmp;
		}
		System.out.println(min+" "+max);
	}
}
