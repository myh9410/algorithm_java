package leetcode_sep;

public class robot_bounded_in_circle {
	public static void main(String[] args) {
		Solution sol = new Solution();
//		String instructions = "GGLLGG";
//		String instructions = "GG";
//		String instructions = "GL";
		String instructions = "GLGLGGLGL";
		System.out.println(sol.isRobotBounded(instructions));
	}
}
class Solution {
    public boolean isRobotBounded(String instructions) {
    	int x = 0,y=0,dir=0;	
        for (int i = 0; i < instructions.length(); i++) {
        	char c = instructions.charAt(i);
			if (c == 'G') {
				switch(dir) {
					case 0:
						x--;
						break;
					case 1:
						y--;
						break;
					case 2:
						x++;
						break;
					case 3:
						y++;
						break;
				}
			} else if (c=='L') {
				switch(dir) {
					case 0:
						dir=1;
						break;
					case 1:
						dir=2;
						break;
					case 2:
						dir=3;
						break;
					case 3:
						dir=0;
						break;
				}
			} else {
				switch(dir) {
					case 0:
						dir=3;
						break;
					case 1:
						dir=0;
						break;
					case 2:
						dir=1;
						break;
					case 3:
						dir=2;
						break;
				}
			}
		}
        if (dir != 0 || (x==0 && y==0)) return true;
        else return false;
    }
}
