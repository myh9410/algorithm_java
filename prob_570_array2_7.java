package jungol;

import java.util.Arrays;
import java.util.Scanner;

public class prob_570_array2_7 {
public static void main(String[] args) {
	int [][] arr = new int[5][5];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if (i==0 || j == 0) {
				arr[i][j] = 1;
			} else {
				arr[i][j] = arr[i-1][j]+arr[i][j-1];
			}
		}
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	}
}
