package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class acmicpc_10815 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int [N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int M = sc.nextInt();
		while(M-->0) {
			boolean checker = true;
			int comp = sc.nextInt();
			int s = 0;
			int e = arr.length-1;
			while (s<=e) {
				int m = (s+e)/2;
				//System.out.println(s+" "+m+" "+e);
				if (comp==arr[m]) {
					checker = false;
					System.out.print(1+" ");
					break;
				} else if (arr[m] < comp) {
					s= m+1;
				} else {
					e=m-1;
				}
			}
			if (checker) System.out.print(0+" ");
		}
	}
}
