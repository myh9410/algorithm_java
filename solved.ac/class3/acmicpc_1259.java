package solved.ac_class3;

import java.util.Scanner;

public class acmicpc_1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			boolean flag = true;
			String s = sc.nextLine();
			if (s.equals("0")) break;
			char [] c = s.toCharArray();
			if (c.length%2 == 1) {
				for (int i = 0; i < (c.length-1)/2; i++) {
					if (c[i] != c[c.length-1-i]) {
						flag = false;
						break;
					}
				}
			} else {
				for (int i = 0; i < c.length/2; i++) {
					if (c[i] != c[c.length-1-i]) {
						flag = false;
						break;
					}
				}
			}
			if (flag) System.out.println("yes");
			else System.out.println("no");
		}//end while
	}//end main
}//end class
