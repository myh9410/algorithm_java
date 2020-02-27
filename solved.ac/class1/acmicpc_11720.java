package solved_ac_Class1;

import java.util.Scanner;

public class acmicpc_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum+=s.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
