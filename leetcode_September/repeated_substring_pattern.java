package leetcode_sep;

public class repeated_substring_pattern {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		String s = "abcabcabcabc";
		boolean answer = sol.repeatedSubstringPattern(s);
		System.out.println(answer);
	}
}
class Solution3 {
	public boolean repeatedSubstringPattern(String s) {
        int N = s.length();
        for (int i = 0; i < N/2; i++) {
        	if (N%(i+1) != 0) continue;
			String tmp = s.substring(0, i+1);
			if (check(s,tmp)) return true;
		}
        return false;
    }

	private boolean check(String s, String tmp) {
		int times = s.length()/tmp.length();
		tmp = tmp.repeat(times);
		if (tmp.equals(s)) return true;
		else return false;
	}
}