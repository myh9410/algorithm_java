package leetcode_sep;

import java.util.Arrays;

public class house_robber {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] nums = {4,1,2,7,5,3,1};
		System.out.println(sol.rob(nums));
	}
}
class Solution {
    public int rob(int[] nums) {
        int [] dp = new int [nums.length];
        if (dp.length == 0) {
        	return 0;
        } else if (dp.length == 1) {
        	return nums[0];
        } else if (dp.length == 2) {
        	return Math.max(nums[0], nums[1]);
        } else if (dp.length == 3) {
	        return Math.max(nums[0]+nums[2], nums[1]);
        } else {
	        dp[0] = nums[0];
	        dp[1] = nums[1];
	        dp[2] = Math.max(dp[0]+nums[2], dp[1]);
	        for (int i = 3; i < dp.length; i++) {
				dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+nums[i], dp[i-3]+nums[i]));
			}
	        return dp[nums.length-1];
        }
    }
}
