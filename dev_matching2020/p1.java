package dev_matching2020;

public class p1 {
	public static void main(String[] args) {
		String P = "00000000000000000000";
		String S = "91919191919191919191";
		int cnt = 0;
		for (int i = 0; i < P.length(); i++) {
			int p = P.charAt(i)-'0';
			int s = S.charAt(i)-'0';
			if (Math.abs(p-s) > 5) {
				if (p < s) {
					cnt += (p+10-s);
				} else {
					cnt += (s+10-p);
				}
			} else {
				cnt += Math.abs(p-s);
			}
		}
		System.out.println(cnt);
	}//end main
}//end class
