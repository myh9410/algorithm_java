package com.java.first;

import java.util.Scanner;

public class Compute {
	public static void main(String[] args) {
		System.out.println("입력 > ");
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int s = sc.nextInt();
		System.out.println("출력 > ");
		System.out.printf("곱 = %d\n",(int)(f*s));
		System.out.printf("목 = %d",(int)(f/s));
	}
}
