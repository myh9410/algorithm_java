package leetcode_sep;

import java.util.Arrays;

public class bulls_and_cows {
	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		String secret = "1122";
		String guess = "1222";
		String answer = sol.getHint(secret, guess);
		System.out.println(answer);
	}
}
class Solution10 {
    public String getHint(String secret, String guess) {
    	int bull = 0;
    	int cow = 0;
        int [] check = new int [10];
        int [] secretArr = new int [secret.length()];
        for (int i = 0; i < secret.length(); i++) {
			check[secret.charAt(i)-'0']++;
		}
        for (int i = 0; i < guess.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i)) {
				bull++;
				check[secret.charAt(i)-'0']--;
			}
		}
		for (int i = 0; i < guess.length(); i++) {
			if (check[guess.charAt(i)-'0'] > 0 && secret.charAt(i) != guess.charAt(i)) {
				check[guess.charAt(i)-'0']--;
				cow++;
			}			
		}
        
    	return bull+"A"+cow+"B";
    }
}
