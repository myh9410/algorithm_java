package List;

import java.util.Scanner;

public class Main_백준_1244_스위치켜고끄기_문용호 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int switchnum = sc.nextInt();
		int [] switches = new int [switchnum+1];
		for (int i = 1; i < switchnum+1; i++) {
			switches[i] = sc.nextInt();
		}
		int stunum = sc.nextInt();
		for (int i = 0; i < stunum; i++) {
			int gender = sc.nextInt();
			int idx = sc.nextInt();
			if (gender == 1) {//남학생
				for (int j = idx; j <= switchnum; j+=idx) {
					switches[j] = switches[j] == 0 ? 1 : 0;
				}
			} else {//여학생
				int count = 0;
				boolean checker = true;
				while(true) {//좌우 대칭 비교
					if (idx == 1 || idx == switchnum) {
						switches[idx] = switches[idx] == 0 ? 1 : 0;
						checker = false;
						break;
					} else {
						if (idx+count > switchnum || idx-count < 1) {
							break;
						} else if (switches[idx-count] != switches[idx+count]) break;
						count++;						
					}//end else
				}//end while
				if (checker) {
					count--;
					for (int j = idx-count; j <= idx+count; j++) {
						switches[j] = switches[j] == 0 ? 1 : 0;
					}
				}
			}//end 여학생
		}//end 학생수만큼
		for (int i = 1; i < switches.length; i++) {
			System.out.print(switches[i]+ " ");
			if (i%20 == 0) System.out.println();
		}
	}// end main
}//end class