package leetcode_sep;

import java.util.HashMap;
import java.util.Map;

public class word_pattern {
	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		String pattern = "abba";
		String str = "dog dog dog dog";
		boolean answer = sol.wordPattern(pattern, str);
		System.out.println(answer);
	}
}

class Solution7 {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<Character, String>();
        String [] strArr = str.split(" ");
        if (pattern.length() != strArr.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			String s = strArr[i];
			if (map.containsKey(c)) {
				if (!map.get(c).equals(s)) return false;
			} else {
				if (map.containsValue(s)) return false;
				map.put(c, s);
			}
		}
    	return true;
    }
}
