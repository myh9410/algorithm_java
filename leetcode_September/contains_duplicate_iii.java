import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class contains_duplicate_iii {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] arr = {-1,2147483647};
		boolean answer = sol.containsNearbyAlmostDuplicate(arr, 1, 2147483647);
		System.out.println(answer);
	}
}
class Solution {
	static List<Val []> list;
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		Val [] result = new Val [2];
		list = new ArrayList<Val[]>();
		boolean answer = false;
        combination(nums,result, 0, 0, k, t);
        for (Val[] v : list) {
        	if (Math.abs(v[0].i - v[1].i) <= k && Math.abs(v[0].val-v[1].val) <= t) {
        		answer = true;
        		break;
        	}
		}
        return answer;
    }
	
	private static void combination(int [] nums,Val [] result, int cnt, int cur, int k, int t) {
		if (cnt == 2) {
			list.add(new Val[] {result[0], result[1]});
			return;
		}
		
		for (int i = cur; i < nums.length; i++) {
			result[cnt]= new Val(i, nums[i]); 
			combination(nums,result,cnt+1,i+1,k,t);
		}
	}
}
class Val {
	long i;
	long val;
	public Val(long i, long val) {
		this.i = i;
		this.val = val;
	}
	@Override
	public String toString() {
		return "Val [i=" + i + ", val=" + val + "]";
	}
	
}
