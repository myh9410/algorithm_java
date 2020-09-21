package leetcode_sep;

public class car_pooling {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int [][] trips = {{3,2,7},{3,7,9},{8,3,9}};
		int capacity = 11;
		System.out.println(sol.carPooling(trips, capacity));
	}
}
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
    	int [] arr = new int [1002];
    	for (int i = 0; i < trips.length; i++) {
			for (int j = trips[i][1]; j < trips[i][2]; j++) {
				arr[j]+=trips[i][0];
				if (arr[j] > capacity) return false;
			}
		}
    	return true;
    }
}
