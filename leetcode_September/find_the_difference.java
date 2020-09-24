package leetcode_sep;

public class find_the_difference {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "abcd";
		String t = "abcde";
		System.out.println(sol.findTheDifference(s, t));
	}
	
}
class Solution {
    public char findTheDifference(String s, String t) {
        int [] alpha = new int [26];
        for (int i = 0; i < s.length(); i++) {
			alpha[s.charAt(i) - 'a']++;
		}
        for (int i = 0; i < t.length(); i++) {
			alpha[t.charAt(i)-'a']--;
		}
        char answer = 0;
        for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] < 0) {
				answer = (char)(i+97);
				break;
			}
		}
    	return answer;
    }
}
