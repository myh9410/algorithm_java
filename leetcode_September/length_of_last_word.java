package leetcode_sep;

import java.util.Arrays;

public class length_of_last_word {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = " ";
		int answer = sol.lengthOfLastWord(s);
		System.out.println(answer);
	}
}

class Solution {
    public int lengthOfLastWord(String s) {
        String [] arr = s.split(" ");
//        System.out.println(Arrays.toString(arr));
        if (arr.length == 0) return 0;
    	return arr[arr.length-1].length();
    }
}
