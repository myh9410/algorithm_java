package jungol;

import java.util.Scanner;

public class prob_560_array6 {
	public static void main(String[] args) {
		int minval = 1000;
		Scanner sc = new Scanner(System.in);
		String [] arrInt = sc.nextLine().split(" ");
		for (int i =0;i<arrInt.length;i++) {
			int int_i = Integer.parseInt(arrInt[i]);
			if (int_i <= minval) {
				minval = int_i;
			}
		}
		System.out.println(minval);
	}
}
