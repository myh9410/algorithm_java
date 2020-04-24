package dev_matching2020;

public class p2 {
	public static void main(String[] args) {
		int [][] office = {{5,-1,4},{6,3,-1},{2,-1,1}};
		int N = office.length;
		//-1은 물건 있어서 못감
		//0~100은 먼지의 양
		//청소기 위치 (r,c)
		int r = 1;
		int c = 0;
		int answer = office[r][c];
		office[r][c] = 0;
		cleaner cleaner = new cleaner(r, c, 3);
		String[] move = {"go","go","right","go","right","go","left","go"};
		for (int i = 0; i < move.length; i++) {
			r = cleaner.r;
			c = cleaner.c;
			if (move[i].equals("go")) {
				switch (cleaner.dir) {
				case 0://동
					if (c+1 < N && office[r][c+1] != -1) {
						cleaner.c +=1;
						answer+= office[r][c+1];
						office[r][c+1] = 0;
					}
					break;
				case 1://남
					if (r+1 < N && office[r+1][c] != -1) {
						cleaner.r +=1;
						answer+= office[r+1][c];
						office[r+1][c] = 0;
					}
					break;
				case 2://서
					if (c-1 >= 0 && office[r][c-1] != -1) {
						cleaner.c -=1;
						answer+= office[r][c-1];
						office[r][c-1] = 0;
					}
					break;
				case 3://북
					if (r-1 >= 0 && office[r-1][c] != -1) {
						cleaner.r -=1;
						answer+= office[r-1][c];
						office[r-1][c] = 0;
					}
					break;
				}
			} else if (move[i].equals("left")) {
				if (cleaner.dir > 0) cleaner.dir -= 1;
				else cleaner.dir = 3;
			} else {//right
				if (cleaner.dir < 3) cleaner.dir += 1;
				else cleaner.dir = 0;
			}
		}
		System.out.println(answer);
	}//end main
}// end class

class cleaner{
	int r;
	int c;
	int dir; //0,1,2,3 동,남,서,북
	public cleaner(int r, int c, int dir) {
		this.r = r;
		this.c = c;
		this.dir = dir;
	}
}