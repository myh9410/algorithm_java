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
			case '(':		// ���ÿ� ������ �ִ´�
				stack[++top] = c;
				break;
			case '*':		// 2���� ���� �켱������ ���������� ������ ���
			case '/':	
				while(top >= 0 &&  (stack[top] == '*' || stack[top] == '/')) {
					System.out.print(stack[top--]);
				}
				stack[++top] = c;
				break;
			case '+':	// 1���� ���� �켱������ ���������� ������ ���				
			case '-':	
				while(top >= 0 &&  (stack[top] == '+' || stack[top] == '-' || stack[top] == '*' || stack[top] == '/')) {
					System.out.print(stack[top--]);
				}
				stack[++top] = c;
				break;
			case ')':		// ( ���� ��ȣ�� ���ö����� ��� ���� ���
				while (top >= 0 && stack[top] != '(') {
					System.out.print(stack[top--]);
				}
				if (top >=0 && stack[top] == '(') {
					top--;
				}
				break;
			default:		// ����
				System.out.print(arr.charAt(i));
				break;
			}//switch
		}//for
		while( top > -1) {
			System.out.print(stack[top--]);
		}
		
	}//eom
//switch case -> break�� : switch���� ��������
}//end class
