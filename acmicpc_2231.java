import java.util.Scanner;

public class acmicpc_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = -1;
		int sum = 0;
		int ans = 0;
		for (int i = N; i >=0; i--) {
			num = i;
			sum = 0;
			while (num!=0) {
				sum+= num%10;
				num /= 10;
			}
			if (i+sum == N) {
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
