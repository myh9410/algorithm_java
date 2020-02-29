package solved.ac_class2;

import java.util.Scanner;

public class acmicpc_11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum = 1;
		for (int i = N; i >N-K; i--) {
			sum*=i;
		}
		for (int i = K; i >0; i--) {
			sum/=i;
		}
		System.out.println(sum);
	}
}
