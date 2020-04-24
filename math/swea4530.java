package math;

import java.util.Scanner;

public class swea4530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			long a = sc.nextLong();
			long b=  sc.nextLong();
			long count = 0;
			a = to9(a);
			b = to9(b);
			a = to10(a);
			b = to10(b);
			count = b-a;
			if (a > 0 && b>0 || a<0 && b<0) System.out.println("#"+t+" "+count);
			else System.out.println("#"+t+" "+(count-1));
		}
	}

	private static long to10(long a) {
		boolean checker = false;
		if (a < 0) {
			checker = true;
		}
		String tmp = a+"";
		long loc = 0;
		long ans = 0;
		for (int i = tmp.length()-1; i>=0; i--) {
			if (tmp.charAt(i) == '-') continue;
			ans += (tmp.charAt(i)-'0')*(long)Math.pow(9, loc++);
		}
		if (checker) ans *=-1;
		return ans;
	}

	private static long to9(long a) {
		boolean checker = false;
		if (a < 0) {
			checker = true;
		}
		String tmp = Math.abs(a)+"";
		StringBuilder sb = new StringBuilder();
		if (checker) {
			sb.append("-");
		}
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i)-'0' > 4) {
				sb.append(tmp.charAt(i)-'1');
			} else {
				sb.append(tmp.charAt(i)-'0');
			}
		}
		return Long.parseLong(sb.toString());
	}
}
