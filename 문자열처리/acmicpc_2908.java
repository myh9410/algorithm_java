package 문자열처리;

import java.util.Scanner;

public class acmicpc_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int a1 = A/100;
		int a2 = (A-a1*100)/10;
		int a3 = (A-a1*100-a2*10)/1;
		int b1 = B/100;
		int b2 = (B-b1*100)/10;
		int b3 = (B-b1*100-b2*10)/1;
		if (b3*100+b2*10+b1 > a3*100+a2*10+a1) {
			System.out.println(b3*100+b2*10+b1);
		} else {
			System.out.println(a3*100+a2*10+a1);
		}
	}
}
