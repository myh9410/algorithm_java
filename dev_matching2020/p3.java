package dev_matching2020;

import java.util.Arrays;
import java.util.LinkedList;

class p3{
	public static void main(String[] args) {
		Solution s = new Solution();
		int [] numbers = {10,40,30,20};
		int K = 20;
		System.out.println(s.solution(numbers, K));
	}
}

class Solution {
    static int [] numb;
	static LinkedList<int []> list = new LinkedList<int[]>();
    static int limit = 0;
    public int solution(int[] numbers, int K) {
    	int answer = Integer.MAX_VALUE;
    	numb = new int [numbers.length];
        System.arraycopy(numbers, 0, numb, 0, numbers.length);
        limit = K;
        perm(numbers.length,0);
        if (list.size() == 0) return -1;
        else {
        	for (int[] arr : list) {
        		System.out.println(Arrays.toString(arr));
        		int tmp = 0;
        		boolean checker = true;
        		for (int i = 0; i < arr.length; i++) {
        			if (arr[i] != numb[i]) {
        				checker = false;
        				tmp++;
        			}
        		}
        		if (!checker) answer = Math.min(tmp, answer);
			}
            return (answer-1);
        }
    }
    
    
    public static void perm(int r, int k) {
		if (r==k) {
			int [] tmp = new int [numb.length]; 
			System.arraycopy(numb, 0, tmp, 0, numb.length);
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < r-1; i++) {
				max = Math.max(max, Math.abs(numb[i] - numb[i+1]));
			}
			System.out.println(max+" "+limit);
			if (max <= limit) {
				list.add(tmp);
			}
		} else {
			for (int i = k; i < numb.length; i++) {
				int tmp = numb[k];
				numb[k] = numb[i];
				numb[i] = tmp;
				perm(r,k+1);
				tmp = numb[k];
				numb[k] = numb[i];
				numb[i] = tmp;
			}
		}
	}//end perm
}