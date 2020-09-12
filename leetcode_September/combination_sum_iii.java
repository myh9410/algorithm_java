package leetcode_sep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class combination_sum_iii {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.combinationSum3(3, 7));
		
	}
}
class Solution {
	static int [] numbers;
	static int [] comb;
	static List<List<Integer>> answer;
    public List<List<Integer>> combinationSum3(int k, int n) {
    	answer = new ArrayList<List<Integer>>();
    	if (n < 6) return answer; 
    	numbers = new int[] {1,2,3,4,5,6,7,8,9};
    	for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
    	comb = new int [k];
    	combination(numbers,numbers.length,k,n);
    	return answer;
    }
	private void combination(int[] arr, int m, int k, int n) {
		if (k==0) {
			if (IntStream.of(comb).sum() == n) {
				List<Integer> list = new ArrayList<Integer>();
				for (int i = 0; i < comb.length; i++) {
					list.add(comb[i]);
				}
				answer.add(list);
			}
		} else if (m < k) {
			return;
		} else {
			comb[k-1] = arr[m-1];
			combination(arr,m-1,k-1,n);
			combination(arr,m-1,k,n);
		}
	}
}
