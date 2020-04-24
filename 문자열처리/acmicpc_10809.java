package 문자열처리;

import java.util.Scanner;

public class acmicpc_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int [] arr = new int [26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i)-'a'] == -1) arr[s.charAt(i)-'a']= i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
