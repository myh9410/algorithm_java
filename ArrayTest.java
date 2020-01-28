package com.ssafy.java2;

import java.util.Scanner;

public class ArrayTest {
	public static void print(int[] arrInt) {
	//출력
		for (int i=0;i<arrInt.length;i++) {
			System.out.printf("%d ",arrInt[i]);
		}
		System.out.println();
	}
	public static void total(int[] arrInt) {
	//합계
		int sum = 0;
		for (int i =0;i<arrInt.length;i++) {
			sum+=arrInt[i];
		}
		System.out.printf("배열의 합 : %d", sum);
		System.out.println();
	}
	public static void average(int[] arrInt) {
	//평균
		int avg = 0;
		for (int i =0;i<arrInt.length;i++) {
			avg+=arrInt[i];
		}
		avg /= arrInt.length;
		System.out.printf("배열의 평균 : %d", avg);
		System.out.println();
	}
	public static void minimum(int[] arrInt) {
	//최소값
		int min = 2147483647;
		for (int i =0;i<arrInt.length;i++) {
			if (arrInt[i] < min) {
				min = arrInt[i];
			}
		}
		System.out.printf("배열의 최소값 : %d", min);
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		args = sc.nextLine().split(" ");
		int [] arrInt = new int [args.length];
		for (int i =0;i<args.length;i++) {
			arrInt[i] = Integer.parseInt(args[i]);
		}
		print(arrInt);
		total(arrInt);
		average(arrInt);
		minimum(arrInt);
	}
}
