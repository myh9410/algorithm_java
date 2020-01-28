package jungol;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class prob_563_array9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] arrStr = sc.nextLine().split(" ");
		int [] arrInt = new int [arrStr.length];
		for (int i =0;i<arrInt.length;i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
		}
		Arrays.sort(arrInt);
		
		for (int i=arrInt.length-1;i>=0;i--) {
			System.out.printf("%d ",arrInt[i]);
		}
	}
}
