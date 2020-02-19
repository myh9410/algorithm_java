package algo;

import java.util.Scanner;
import java.util.Stack;

public class acmicpc_4949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		outerloop:while (true) {
			Stack<Character> q = new Stack<Character>();
			String s = sc.nextLine();
			boolean flag = true;
			boolean sflag = true;
			for (int i = 0; i < s.length(); i++) {
				if (i == 0 && s.charAt(i) == '.') break outerloop;
				if (s.charAt(i) == '.') {
					break;
				}
				if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
					q.add(s.charAt(i));
				}
				if (s.charAt(i) == ')') {
					if (q.isEmpty()) {
						sflag=false;
						break;
					}
					if (q.pop() != '(') {
						sflag=false;
						break;
					}
				} else if (s.charAt(i) == '}') {
					if (q.isEmpty()) {
						sflag=false;
						break;
					}
					if (q.pop() != '{') {
						sflag=false;
						break;
					}
				} else if (s.charAt(i) == ']') {
					if (q.isEmpty()) {
						sflag=false;
						break;
					}
					if (q.pop() != '[') {
						sflag=false;
						break;
					}
				}
			}//end for
			if (sflag) {
				if (q.isEmpty()) System.out.println("yes");
				else System.out.println("no");
			} else {
				System.out.println("no");
			}
			if (!flag) break;
		}//end while true
	}//end main
}//end class
