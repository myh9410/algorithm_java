package leetcode_sep;

public class best_time_to_buy_and_sell_stock {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] prices = {7,6,4,3,1};
		System.out.println(sol.maxProfit(prices));
	}
}
class Solution {
    public int maxProfit(int[] prices) {
    	int max = 0;
    	for (int i = 0; i < prices.length-1; i++) {
			for (int j = i+1; j < prices.length; j++) {
				if (prices[j]-prices[i] > max) max = prices[j]-prices[i];
			}
		}
    	return max;
    }
}
