package acmicpc;

import java.util.Scanner;

//수 이어 쓰기 1
//힌트 : 자릿수만 계산하면 된다.
//https://www.acmicpc.net/problem/1748
public class acmicpc_1748 {
	public static void main(String[] args) {
		int [] start = {1,10,100,1000,10000,100000,1000000,10000000};
		int [] end = {9,99,999,9999,99999,999999,9999999,99999999};
		//8, 178, 8091, 35996, 449995, 5399994,62999993,719999992, 100000000 - 9자리
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int N = Integer.parseInt(str);
		int sum = 0;
		if (N == 100000000) {
			sum = 9;
			for (int i = 0; i < end.length; i++) {
				sum+= (end[i]-start[i]+1)*(i+1);
			}
			System.out.println(sum);
		} else {
			for (int i = 0; i < str.toCharArray().length; i++) {
				if (i == str.toCharArray().length-1) {
					sum+=(N-start[i]+1)*(i+1);
				}
				else {
					sum+=(end[i]-start[i]+1)*(i+1);
				}
			}
			System.out.println(sum);
		}//end else
	}
}
