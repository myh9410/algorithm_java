package solved.ac_class3;

import java.util.Scanner;

public class acmicpc_17626 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 4;
		for (int i = (int)Math.sqrt(num); i >= (int)Math.sqrt(num/4); i--) {
			if (i*i == num) {
				sum = 1;
				break;
			}
			else {
				int tmp = num - i*i;
				for (int j = (int)Math.sqrt(tmp); j >= (int)Math.sqrt(tmp/4); j--) {
					if (i*i+j*j == num) {
						sum = Math.min(sum, 2);
						continue;
					}
					else {
						tmp = num - i*i -j*j;
						for (int k = (int)Math.sqrt(tmp); k >= (int)Math.sqrt(tmp/2); k--) {
							if (i*i+j*j+k*k == num) sum = Math.min(sum, 3); 
						}
					}
				}
			}		
		}
		System.out.println(sum);
	}
}
