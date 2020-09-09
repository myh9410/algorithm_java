package leetcode_sep;

public class compare_version_numbers {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String version1 = "0.1";
		String version2 = "1.1";
		int answer = sol.compareVersion(version1, version2);
		System.out.println(answer);
	}
}

class Solution {
    public int compareVersion(String version1, String version2) {
        int result = -2;
    	String [] arr1 = version1.split("\\.");
    	String [] arr2 = version2.split("\\.");
        
    	long val1, val2;
        if (arr1.length > arr2.length) {
        	for (int i = 0; i < arr1.length; i++) {
        		val1 = Long.parseLong(arr1[i]);
				if (i > arr2.length-1) val2 = 0;
				else val2 = Long.parseLong(arr2[i]);
				
				if (val1 > val2) {
					result = 1;
					break;
				} else if (val2 > val1) {
					result = -1;
					break;
				}
			}
        } else if (arr1.length < arr2.length) {
        	for (int i = 0; i < arr2.length; i++) {
        		val2 = Long.parseLong(arr2[i]);
				if (i > arr1.length-1) val1 = 0;
				else val1 = Long.parseLong(arr1[i]);
				
				if (val1 > val2) {
					result = 1;
					break;
				} else if (val2 > val1) {
					result = -1;
					break;
				}
			}
        } else {
        	for (int i = 0; i < arr1.length; i++) {
        		val1 = Long.parseLong(arr1[i]);
        		val2 = Long.parseLong(arr2[i]);
        		
				if (val1 > val2) {
					result = 1;
					break;
				} else if (val2 > val1) {
					result = -1;
					break;
				}
			}
        }
    	if (result == -2) return 0;
    	else return result;
    }
}
