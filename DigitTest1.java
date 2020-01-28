package com.ssafy.second;

import java.util.Scanner;

public class DigitTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		args = sc.nextLine().split(" ");
		int [] ans = new int[10];
		for (int i=0; i<args.length;i++) {
			if (Integer.parseInt(args[i]) == 0) {
			}
			else if (Integer.parseInt(args[i]) < 10) {
				ans[0] += 1;
			}
			else {
				ans[Integer.parseInt(args[i].substring(0,1))]+=1;
			}
		}
		for (int i=0; i<ans.length;i++) {
			if (ans[i] == 0) {
			}else {
				System.out.printf(i + " : " + ans[i] + "개");
				System.out.println();
			}
		}
	}
}