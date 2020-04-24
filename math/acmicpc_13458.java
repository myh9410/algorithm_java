package math;

import java.util.Scanner;

public class acmicpc_13458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		int c = sc.nextInt();
		long cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int tmp = arr[i];
			if (tmp - b <= 0) {
				cnt++;
				continue;
			} else {
				tmp-=b;
				cnt++;
				if (tmp%c==0) cnt+=tmp/c;
				else cnt+=(tmp/c+1);
			}
		}
		System.out.println(cnt);
	}
}
