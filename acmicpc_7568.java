import java.util.Scanner;

public class acmicpc_7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] weight = new int [N];
		int [] height = new int [N];
		int [] comp = new int [N];
		for (int i = 0; i < N; i++) {
			weight[i] = sc.nextInt();
			height[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (weight[i] < weight[j] && height[i] < height[j]) {
					comp[i]+=1;
				}
			}
		}
		for (int rank : comp) {
			System.out.print((rank+1) + " ");
		}
	}
}
