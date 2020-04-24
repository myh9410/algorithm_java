package 문자열처리;

import java.util.Scanner;

public class acmicpc_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int [] arr = new int [26];
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)-'a']++;
		}
		int max = Integer.MIN_VALUE;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				ans = i;
			}
		}
		boolean checker = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max && ans != i) {
				checker = false;
				break;
			}
		}
		if (checker) {
			char c = (char) (ans+65);
			System.out.println(c);
		} else {
			System.out.println("?");
		}
	}
}
