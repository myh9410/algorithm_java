package com.java.first;

import java.util.Scanner;

public class CheckPoint {
	public static void main(String[] args) {
		//몸무게 + 100 -키
		System.out.println("입력 > ");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int rs = w+100-h;
		System.out.println("출력 > ");
		System.out.printf("비만수치는 %d\n",rs);
		if (rs > 0) {
			System.out.println("당신은 비만이군요");
		}
		
	}
}
