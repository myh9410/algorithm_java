package leetcode_sep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majority_element_ii {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] nums = {3,2,3};
		System.out.println(sol.majorityElement(nums));
	}
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	List<Integer> answer = new ArrayList<Integer>();
    	for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int cnt = map.get(nums[i]);
				map.put(nums[i], cnt+1);
			} else {
				map.put(nums[i], 1);
			}
		}
    	for (int i : map.keySet()) {
    		if (map.get(i) > nums.length/3) answer.add(i);
    	}
    	
    	return answer;
    }
}
