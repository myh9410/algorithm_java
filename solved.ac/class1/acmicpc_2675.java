package solved_ac_Class1;

import java.util.Scanner;

public class acmicpc_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc= sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < tc; t++) {
			String [] sArr = sc.nextLine().split(" ");
			int times = Integer.parseInt(sArr[0]);
			String s = sArr[1];
			String ans = "";
			for (int i = 0; i < s.length(); i++) {
				int tmp = times;
				while (tmp-- > 0) ans += s.charAt(i);
			}
			System.out.println(ans);
		}
	}
}
