package permutation_combination;

import java.util.Arrays;
import java.util.Scanner;

public class acmicpc_2529 {
	static int [] max;
	static int [] min;
	static long maxVal = Long.MIN_VALUE;
	static long minVal = Long.MAX_VALUE;
	static int [] maxArr = {9,8,7,6,5,4,3,2,1,0};
	static int [] minArr = {0,1,2,3,4,5,6,7,8,9};
	static String [] s;
	static String ans1,ans2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		max = Arrays.copyOfRange(maxArr, 0, N+1);
		min = Arrays.copyOfRange(minArr, 0, N+1);
		sc.nextLine();
		s = sc.nextLine().split(" ");
		permMax(max.length-1,0);
		permMin(min.length-1,0);
		System.out.println(ans1);
		System.out.println(ans2);
	}
	
	private static void permMin(int r, int k) {
		if (r==k) {//Á¾·á
//			System.out.println(Arrays.toString(min));
			checkMin(min);
		} else {//Àç±Í
			for (int i = k; i < min.length; i++) {
				int tmp = min[k];
				min[k] = min[i];
				min[i] = tmp;
				permMin(r,k+1);
				tmp = min[k];
				min[k] = min[i];
				min[i] = tmp;
			}
		}
	}
	
	private static void permMax(int r, int k) {
		if (r==k) {//Á¾·á
//			System.out.println(Arrays.toString(max));
			checkMax(max);
		} else {//Àç±Í
			for (int i = k; i < max.length; i++) {
				int tmp = max[k];
				max[k] = max[i];
				max[i] = tmp;
				permMax(r,k+1);
				tmp = max[k];
				max[k] = max[i];
				max[i] = tmp;
			}
		}
	}//end perMax
	
	private static void checkMax(int[] arr) {
		int before = arr[0];
		boolean flag = true;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("<")) {
				if (before > arr[i+1]) {
					flag = false;
					before = arr[i+1];
				}
			} else {
				if (before < arr[i+1]) {
					flag = false;
					before = arr[i+1];
				}
			}
		}//end for
		if (flag) {
			String atos = Arrays.toString(arr).replaceAll("[^0-9]","");
			long arrtoi = Long.parseLong(atos);
			System.out.println("max : "+arrtoi);
			if ((long)maxVal < (long)arrtoi) {
				maxVal = arrtoi;
				ans1 = atos;
			}
		}
	}//end checkMax
	
	private static void checkMin(int[] arr) {
		int before = arr[0];
		boolean flag = true;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("<")) {
				if (before > arr[i+1]) {
					flag = false;
					break;
				}
				before = arr[i+1];
			} else {
				if (before < arr[i+1]) {
					flag = false;
					break;
				}
				before = arr[i+1];
			}
		}//end for
		if (flag) {
			String atos = Arrays.toString(arr).replaceAll("[^0-9]","");
			long arrtoi = Long.parseLong(atos);
			System.out.println("min : "+ arrtoi);
			if (minVal > arrtoi) {
				minVal = arrtoi;
				ans2 = atos;
			}
		}
	}//checkMin
}//end class
