package leetcode_sep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insert_interval {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int [][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int [] newInterval = {4,8};
		int [][] answer = sol.insert(intervals, newInterval);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(Arrays.toString(answer[i]));			
		}
	}
}

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    	List<int []> list = new ArrayList<int[]>();
    	int idx = 0;
    	while ((idx < intervals.length) && newInterval[0] > intervals[idx][1]) {
    		list.add(intervals[idx]);
    		idx++;
    	}
    	
    	while((idx < intervals.length)&&(newInterval[1] >= intervals[idx][0])) {
    		newInterval[0] = Math.min(newInterval[0], intervals[idx][0]);
    		newInterval[1] = Math.max(newInterval[1], intervals[idx][1]);
    		idx++;
    	}
    	list.add(newInterval);
    	while(idx < intervals.length) {
    		list.add(intervals[idx]);
    		idx++;
    	}
    	
    	int [][] answer = new int [list.size()][2];
    	for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
    	return answer;
    }
}
