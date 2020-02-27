package solved_ac_Class1;

import java.util.Scanner;

public class acmicpc_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {
			String s = sc.nextLine();
			int sum = 0;
			int idx = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'O') {
					sum += ++idx;
				} else {
					idx = 0;
				}
			}
			System.out.println(sum);
		}//end tc
	}//end main
}//end class
