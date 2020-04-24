/*package swea;

import java.util.HashMap;
import java.util.Scanner;

//점화식 유도로 풀기
public class swea5604_점화 {
	static int T;
	static long A,B;
	static HashMap<Long, Long> m = new HashMap<Long, Long>();
	
	public static void main(String[] args) {
		m.clear();
		for (int i = 1; i < 17; i++) {
			long v=pow10(0L+i);
			m.put(v-1L, h(v-1L));
		}
		
		Scanner sc= new Scanner(System.in);
		T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			A=sc.nextLong();
			B=sc.nextLong();
		}
		
	}
	
	public static long cal(long b,long a) {
		if (a <=1) {
			return f(b);
		} else if (a==b) {
			return f(b)-f(a-1);
		} else {
			return f(b)-f(a-1);
		}
	}

	private static long f(long n) {
		return (long)(Math.pow(10, n));
	}
}
*/