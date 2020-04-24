package DFS;

import java.util.Arrays;
import java.util.Scanner;
  
public class acmicpc_11403_2 {
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
        
        //Á¤Á¡ÀÇ °¹¼ö n
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
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
