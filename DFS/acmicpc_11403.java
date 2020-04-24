package DFS;

import java.util.Scanner;
import java.util.Stack;

public class acmicpc_11403 {
	static int [][] map;
	static int [][] ans;
	static int [][] visited;
	static Stack<Integer> stack;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		map = new int [N+1][N+1];
		ans = new int [N+1][N+1];
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map.length; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map.length; j++) {
				visited = new int [N+1][N+1];
				stack = new Stack<Integer>();
				stack.add(i);
				DFS(i,j);
			}
		}
		for (int i = 1; i < ans.length; i++) {
			for (int j = 1; j < ans.length; j++) {
				System.out.print(ans[i][j]+" ");			}
			System.out.println();
		}
		
	}//end main
	
	private static void DFS(int x, int y) {//x,y는 변하지 않고 목표지점 나타냄
		boolean ch = true;
		while (!stack.isEmpty()) {
			int cur_x = stack.pop();
			for (int i = 1; i < map.length; i++) {
				if (map[cur_x][i] == 1 && visited[cur_x][i] == 0) {
					if (y == i) {
						ch = false;
						break;
					}
					ans[cur_x][i] = 1;
					stack.add(i);
				}
			}
		}
		if (ch) {
			map[x][y] = 0;
		} else {
			map[x][y] = 1;
			return;
		}
	}//end DFS
}//end class

/*
package algorithm_DFS;
 
import java.util.Arrays;
import java.util.Scanner;
 
 
public class q_11403 {
    static int n;
    static int[][] ans = new int[n+1][n+1];
    static int[][] arr;
    static int[] check;
    public static void dfs(int n) {
        for(int i=1;i<arr.length;i++) {
            if(arr[n][i]==1 && check[i]==0) {
                check[i] = 1;
                dfs(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //정점의 갯수 n
        n = scan.nextInt();
        arr = new int[n+1][n+1];
        ans = new int[n+1][n+1];
        check = new int[n+1];
        
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        
        for(int i=1;i<=n;i++) {
            dfs(i);
            for(int j=1;j<=n;j++) {
                ans[i][j] = check[j];
            }
            Arrays.fill(check, 0);
        }
        
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.println(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
 */
