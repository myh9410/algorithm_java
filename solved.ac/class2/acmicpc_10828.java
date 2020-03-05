package solved.ac_class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class acmicpc_10828 {
	//push, pop, isEmpty,top
	public static void main(String[] args) throws NumberFormatException, IOException {
		//api 활용하여 stack 생성
		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//알고리즘 풀때 스택 활용
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String s = st.nextToken();
			if (s.equals("push")) {
				stack.add(Integer.parseInt(st.nextToken()));
			} else if (s.equals("top")) {
				try {
					System.out.println(stack.peek());
				} catch (Exception e) {
					System.out.println(-1);
				}
			} else if (s.equals("size")) {
				System.out.println(stack.size());
			}  else if (s.equals("empty")) {
				if (stack.empty()) System.out.println(1);
				else System.out.println(0);
			} else if (s.equals("pop")) {
				try {
					System.out.println(stack.pop());
				} catch (Exception e) {
					System.out.println(-1);
				}
			}
		}
	}
}