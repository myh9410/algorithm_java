package solved_ac_Class1;

import java.util.Scanner;

public class acmicpc_2920 {
	public static void main(String[] args) {
		int [] ascArr = {1,2,3,4,5,6,7,8};
		int [] descArr = {8,7,6,5,4,3,2,1};
		boolean ascCheck = true;
		boolean descCheck = true;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			int tmp = sc.nextInt();
			if (tmp != ascArr[i]) {
				ascCheck = false;
			}
			if (tmp != descArr[i]) {
				descCheck = false;
			}
		}
		if (ascCheck) {
			System.out.println("ascending");
		} else if (descCheck) {
			System.out.println("descending");			
		} else {
			System.out.println("mixed");
		}
	}
}
