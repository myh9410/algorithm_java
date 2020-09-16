package leetcode_sep;

public class maximum_xor_of_two_numbers_in_an_array {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] nums = {3,10,5,25,2,8};
		System.out.println(sol.findMaximumXOR(nums));
	}
}
class Solution {
    public int findMaximumXOR(int[] nums) {
    	int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				int answer = nums[i]^nums[j];
				if (max < answer) max = answer;
			}
		}
    	return max;
    }
}
