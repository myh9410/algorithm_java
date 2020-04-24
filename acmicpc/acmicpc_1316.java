package acmicpc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class acmicpc_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int count = 0;
		for (int i = 0; i < N; i++) {
			boolean flag = true;
			String s = sc.nextLine();
			Set<Character> set = new HashSet<Character>();
			if (s.length() == 1) {
				count++;
				continue;
			}
			set.add(s.charAt(0));
			for (int j = 1; j < s.length(); j++) {
				char c = s.charAt(j);
				if (s.charAt(j-1) == c) continue;
				else {
					if (set.contains(c)) {
						flag = false;
						break;
					}
					else {
						set.add(c);
					}
				}
			}
			if (flag) count++;
		}
		System.out.println(count);
	}//end main
}//end class
