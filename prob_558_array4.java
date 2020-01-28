package jungol;

import java.util.Scanner;

public class prob_558_array4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp =0;		
		int [] arrInt = new int [100];
		for (int i = 0; i<arrInt.length;i++) {
			temp = i;
			arrInt[i] = sc.nextInt();
			if (arrInt[i] == 0) break;
		}
		for (int j=temp-1;j>=0;j--) {
			System.out.printf("%d ",arrInt[j]);
		}
		sc.close();
	}
}
