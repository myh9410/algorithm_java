import java.util.Arrays;

public class largest_time_for_given_digits {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] arr = {1,9,6,0};
		String answer = sol.largestTimeFromDigits(arr);
		System.out.println(answer);
	}
}

class Solution {
    public String largestTimeFromDigits(int[] A) {
    	Arrays.sort(A);
    	String answer = "-1111";
    	do {
    		String tmp = "";
    		for (int i = 0; i < A.length; i++) {
				tmp+= A[i];
			}
    		if (tmp.compareTo(answer) > 0 && checker(tmp)) answer = tmp;
    	} while (nextPermutation(A));
    	if (answer.equals("-1111")) return "";
    	else {
    		answer = answer.substring(0, 2) +":"+ answer.substring(2, 4);
    		return answer;
    	}
    }
    private boolean checker(String tmp) {
    	if (tmp.compareTo("0000") >= 0 && tmp.compareTo("2359") <= 0 
    			&& tmp.charAt(2) >= '0' && tmp.charAt(2) <= '5') {
    		return true;
    	} else {
    		return false;    		
    	}
	}
	private static boolean nextPermutation(int [] A) {
		//step 1
		int i = 3;
		while (i>0 && A[i-1] >= A[i]) --i;
		if (i==0) return false;
		
		//step 2
		int j = 3;
		while(A[i-1] >= A[j]) --j;
		
		//step 3
		int temp = A[i-1];
		A[i-1] = A[j];
		A[j] = temp;
		
		//step 4
		int k = 3;
		while(i<k) {
			temp = A[i];
			A[i] = A[k];
			A[k] = temp;
			++i;
			--k;
		}
		return true;
	}
}
