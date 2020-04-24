package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class acmicpc_2805 {
	static long [] arr;
	static long min=0,mid=0,max=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
		long maxVal = 0;
		arr = new long [N];
		min = Long.MAX_VALUE;
		max = Long.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			long v = sc.nextLong();
			arr[i] = v;
		}
		Arrays.sort(arr);
		min = 0;
		max = arr[arr.length-1];
		long minLen = arr[arr.length-1];
		while (min <= max) {
			mid = (max+min)/2;
//			System.out.println(min +" "+mid +" "+max);
			long sum =check();
//			System.out.println("sum : "+sum);
			if (sum < M) {
				max = mid-1;
			} else if (sum >= M) {
				if(sum <= minLen) {
					minLen = sum;
					maxVal = mid;
				}
				min = mid+1;
			}
		}
		System.out.println(maxVal);
	}

	private static long check() {
		long i=0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > mid) {
				i+=(arr[j]-mid);
			}
		}
		return i;
	}
}
