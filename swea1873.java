import java.util.Arrays;
import java.util.Scanner;
/*
U	Up : 전차가 바라보는 방향을 위쪽으로 바꾸고, 한 칸 위의 칸이 평지라면 위 그 칸으로 이동한다.
D	Down : 전차가 바라보는 방향을 아래쪽으로 바꾸고, 한 칸 아래의 칸이 평지라면 그 칸으로 이동한다.
L	Left : 전차가 바라보는 방향을 왼쪽으로 바꾸고, 한 칸 왼쪽의 칸이 평지라면 그 칸으로 이동한다.
R	Right : 전차가 바라보는 방향을 오른쪽으로 바꾸고, 한 칸 오른쪽의 칸이 평지라면 그 칸으로 이동한다.
S	Shoot : 전차가 현재 바라보고 있는 방향으로 포탄을 발사한다.
*/
public class swea1873 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			int x=0,y=0;
			int H = sc.nextInt();
			int W = sc.nextInt();
			String [][] map = new String [H][W];
			for (int i = 0; i < map.length; i++) {
				String [] s = sc.next().split("");
				map[i] = s;
			}
			int N = sc.nextInt();
			String [] command = new String [N];
			command =sc.next().split("");
			//입력 끝
			int dir = 0; //상 :1 하:2 좌:3 우:4
			boolean flag = false;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j].equals("<")) {
						x = i; y = j; dir = 3; flag = true;
						break;					
					} else if (map[i][j].equals("v")) {
						x = i; y = j; dir = 2; flag = true;
						break;
					} else if (map[i][j].equals("^")) {
						x = i; y = j; dir = 1; flag = true;
						break;
					} else if (map[i][j].equals(">")){
						x = i; y = j; dir = 4; flag = true;
						break;
					}
				}//end inner for
				if (flag) break;
			}//탱크 위치찾기
			for (int i = 0; i < command.length; i++) {
				switch (command[i]) {
				case "U"://상
					dir = 1;
					if ((x-1 >= 0) && map[x-1][y].equals(".")) {						
						map[x][y] = ".";
						map[x-1][y] = "^";
						x-=1;
					} else {
						map[x][y] = "^";
					}
					break;
				case "D"://하
					dir = 2;
					if ((x+1 <map.length) && map[x+1][y].equals(".")) {						
						map[x][y] = ".";
						map[x+1][y] = "v";
						x+=1;
					} else {
						map[x][y] = "v";
					}
					break;
				case "L"://좌
					dir = 3;
					if ((y-1 >= 0) && map[x][y-1].equals(".")) {						
						map[x][y] = ".";
						map[x][y-1] = "<";
						y-=1;
					} else {
						map[x][y] = "<";
					}
					break;
				case "R"://우
					dir = 4;
					if ((y+1 < W) && map[x][y+1].equals(".")) {						
						map[x][y] = ".";
						map[x][y+1] = ">";
						y+=1;
					} else {
						map[x][y] = ">";
					}
					break;
				case "S": // 슈팅
					if (dir ==1) {//상 보는중
						for (int j = x-1; j >=0; j--) {
							if (map[j][y].equals("#")) break;
							if (map[j][y].equals("*")) {
								map[j][y] = ".";
								break;
							}
						}
					} else if (dir ==2) {//하 보는중
						for (int j = x+1; j <H; j++) {
							if (map[j][y].equals("#")) break;
							if (map[j][y].equals("*")) {
								map[j][y] = ".";
								break;
							}
						}
					} else if (dir == 3) {//좌 보는중
						for (int j = y-1; j >=0; j--) {
							if (map[x][j].equals("#")) break;
							if (map[x][j].equals("*")) {
								map[x][j] = ".";
								break;
							}
						}
					} else {//우 보는중
						for (int j = y+1; j <W; j++) {
							if (map[x][j].equals("#")) break;
							if (map[x][j].equals("*")) {
								map[x][j] = ".";
								break;
							}
						}
					}
					break;
				}
				for (int j = 0; j < map.length; j++) {
					System.out.println(Arrays.toString(map[j]));
				}
				System.out.println();
			}// end for
			
			for (int i = 0; i < map.length; i++) {
				if (i == 0) {
					System.out.print("#"+testcase+" ");
				}
				for (int j = 0; j < map[i].length; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}//출력문
			
		}//end tc
	}//end main
}//end class
