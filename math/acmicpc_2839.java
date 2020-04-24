package math;

import java.util.Scanner;

public class acmicpc_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int [] bag = new int [2];//bag[0] : 5kg bag[1] : 3kg
		int M = sc.nextInt();//배달해야할 M 입력받음
		if (M%5 == 0) { //처음에 5로 나눠 떨어지면 그게 제일 최소의 봉지수
			System.out.println(M/5);
		} else {
			bag[0] = M/5; //bag[0]에 값 저장해놓고
			boolean checker = false;//나눠 떨어지는지 여부 확인위한 변수
			for (int i = bag[0]; i >= 0; i--) {
				int tmp = M-5*i;
				if (tmp%3 == 0) {
					bag[1] = tmp/3; 
					checker = true; 
					System.out.println(i+bag[1]);
					break;
				}
			}
			if (!checker) {
				System.out.println(-1);
			}
		}//else
	}//end main
}
