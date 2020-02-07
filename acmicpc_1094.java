package baekjoon;

import java.util.Scanner;

public class acmicpc_1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int ans = 0;
		int [] arr = {64,32,16,8,4,2,1};
		for (int i = 0; i < arr.length; i++) {
			if (X==arr[i]) {
				ans++;
				break;
			} else if (X<arr[i]){
				continue;
			} else {
				X-=arr[i];
				ans++;
			}
		}
		sc.close();
		System.out.println(ans);
	}
}
