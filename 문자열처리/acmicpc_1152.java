package 문자열처리;

import java.util.Scanner;

public class acmicpc_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (s.equals(" ")){
			System.out.println(0);
		} else {
			String [] arr = s.strip().split(" ");
			System.out.println(arr.length);						
		}
	}
}
