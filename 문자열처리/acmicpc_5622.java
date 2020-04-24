package 문자열처리;

import java.util.Scanner;

public class acmicpc_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [26];
		int time = 2;
		for (int i = 0; i <= 14; i++) {
			if (i%3 == 0) time++;
			arr[i] = time;
		}
		time++;
		for (int i = 15; i <= 18; i++) {
			arr[i] = time;
		}
		time++;
		for (int i = 19; i <= 21; i++) {
			arr[i] = time;
		}
		time++;
		for (int i = 22; i <= 25; i++) {
			arr[i] = time;
		}
		String s = sc.nextLine();
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			ans += arr[s.charAt(i)-'A'];
		}
		System.out.println(ans);
	}	
}
