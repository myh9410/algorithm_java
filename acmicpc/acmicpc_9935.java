package acmicpc;

import java.util.Scanner;
import java.util.Stack;

public class acmicpc_9935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		String s = sc.nextLine();
		String bomb = sc.nextLine();
		while(true) {
			while (s.contains(bomb)) {
				int idx = s.indexOf(bomb);
				if (idx == 0) {
					s= s.substring(bomb.length(), s.length());
				} else if (idx == s.length()-bomb.length()){
					s= s.substring(0, s.length()-bomb.length());
				} else {
					s= s.substring(0, idx) + s.substring(idx+bomb.length(), s.length());
				}
			}
			if (s.equals("")) {
				System.out.println("FRULA");
				break;
			} else {
				System.out.println(s);
				break;
			}
		}//end while true
	}
}
