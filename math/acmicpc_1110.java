package math;

import java.util.Scanner;

public class acmicpc_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int tmp = start;
		int times = 0;
		while(true) {
			times++;
			int s = tmp/10;
			int e = tmp%10;
			tmp = e*10+(s+e)%10;
			if (tmp == start) {
				break;
			}
		}
		System.out.println(times);
	}
}
