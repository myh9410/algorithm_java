package leetcode_sep;

import java.util.ArrayList;
import java.util.List;

public class partition_labels{
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		String S = "ababcbacadefegdehijhklij";
		sol.partitionLabels(S);
	}
}

class Solution4 {
    public List<Integer> partitionLabels(String S) {
    	List<Integer> list = new ArrayList<Integer>();
    	int [] lastIndex = new int [26];
    	for (int i = 0; i < S.length(); i++) {
			lastIndex[S.charAt(i)-'a'] = i;
		}
    	int start = 0;
    	int end = 0;
    	for (int i = 0; i < S.length(); i++) {
			end = Math.max(end, lastIndex[S.charAt(i)-'a']);
			if (i == end) {
				list.add(end-start+1);
				start = end+1;
			}
		}
    	return list;
    }
}