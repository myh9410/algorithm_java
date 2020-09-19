package leetcode_sep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sequential_digits {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int low = 1000;
		int high = 13000;
		System.out.println(sol.sequentialDigits(low, high));
	}
}

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
    	List<Integer> list = new ArrayList<Integer>();
    	String tmp = low+"";
        int len = tmp.length();
        int n =0;
        for (int i = 1; i <= 10-len; i++) {
			n=i;
			for (int j = i+1; j < 10; j++) {
				n = n*10+j;
				if (n >= low && n <= high) list.add(n);
			}
		}
        Collections.sort(list);
    	return list;
    }
}
