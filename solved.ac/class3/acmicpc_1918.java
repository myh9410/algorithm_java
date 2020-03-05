package solved.ac_class3;

import java.util.Scanner;

public class acmicpc_1918 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr = sc.nextLine();
		char[] stack = new char[100];
		int top = -1;
		for (int i = 0; i < arr.length(); i++) {
			char c = arr.charAt(i);
			switch (c) {
			case '(':		// 스택에 무조건 넣는다
				stack[++top] = c;
				break;
			case '*':		// 2보다 작은 우선순위가 있을때까지 꺼내서 출력
			case '/':	
				while(top >= 0 &&  (stack[top] == '*' || stack[top] == '/')) {
					System.out.print(stack[top--]);
				}
				stack[++top] = c;
				break;
			case '+':	// 1보다 작은 우선순위가 있을때까지 꺼내서 출력				
			case '-':	
				while(top >= 0 &&  (stack[top] == '+' || stack[top] == '-' || stack[top] == '*' || stack[top] == '/')) {
					System.out.print(stack[top--]);
				}
				stack[++top] = c;
				break;
			case ')':		// ( 여는 괄호가 나올때까지 모두 빼서 출력
				while (top >= 0 && stack[top] != '(') {
					System.out.print(stack[top--]);
				}
				if (top >=0 && stack[top] == '(') {
					top--;
				}
				break;
			default:		// 숫자
				System.out.print(arr.charAt(i));
				break;
			}//switch
		}//for
		while( top > -1) {
			System.out.print(stack[top--]);
		}
		
	}//eom
//switch case -> break문 : switch문을 빠져나감
}//end class
