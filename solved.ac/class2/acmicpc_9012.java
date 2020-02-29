package solved.ac_class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class acmicpc_9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			boolean flag = true;
			char [] c = br.readLine().toCharArray();
			Stack<Character> s = new Stack<Character>();
			for (char parenthesis : c) {
				if (parenthesis == '(') s.add(parenthesis);
				else {
					if (s.size() == 0) {
						flag = false;
						break;
					}
					s.pop();
				}
			}
			if (!flag) System.out.println("NO");
			else {
				if (s.size() != 0) System.out.println("NO");
				else System.out.println("YES");				
			}
		}//end tc
	}//end main
}//end class
