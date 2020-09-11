package leetcode_sep;

public class maximum_product_subarray {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] nums = {-2,0,-1};
		long answer = sol.maxProduct(nums);
		System.out.println(answer);
	}
}
class Solution {
	public int maxProduct(int[] nums) {
        int [] dp = new int [nums.length];
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
        	int tmp = nums[i];
        	if (max < tmp) max = tmp;
        	for (int j = i+1; j < nums.length; j++) {
				    tmp*=nums[j];
				    if (max < tmp) max = tmp;
			    }
        }    
        return max;
    }
};
