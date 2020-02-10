import java.util.Scanner;

public class swea4408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			int [] hall = new int [200];
			for (int j = 0; j < N; j++) {
				int st = sc.nextInt();
				int ed = sc.nextInt();
				int tmp1 = checker(st);
				int tmp2 = checker(ed);
				if (tmp1 <= tmp2) {
					for (int k = tmp1; k <= tmp2; k++) {
						hall[k]++;
					}
				} else {
					for (int k = tmp2; k <= tmp1; k++) {
						hall[k]++;
					}
				}
			}
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < hall.length; j++) {
				if (hall[j] >= max) max = hall[j];
			}
			System.out.println("#"+i+" "+max);
		}//end tc
	}//end main
	
	public static int checker(int i) {
		int re=0;
		if (i%2 == 0) {//짝
			re = i/2-1;	
		} else {//홀
			re = i/2;
		}
		return re;
	}
}//end class
