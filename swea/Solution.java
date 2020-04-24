package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class Solution {
    
    static int T,X;
    static int[] buttons = new int[10];
    static int dp[];
    static final int IMPOSSIBLE = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        T = Integer.parseInt(br.readLine());
        
        int t = 1;
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int i = 0; i < 10; i++) {
                buttons[i] = Integer.parseInt(st.nextToken());
            }
            
            X = Integer.parseInt(br.readLine());
            
            // X�� 10 ������ �� �����Ƿ�... 
            dp = new int[X+10];
            
            for (int i = 0; i < 10; i++) {
                if(buttons[i] == 1) {
                    dp[i] = 1;
                }
            }
            
            solve(X);
            System.out.printf("#%d %d\n",t++,dp[X] == IMPOSSIBLE ? -1 : dp[X]+1);
        }
    }
    
    static int solve(int num) {
        if(dp[num] != 0) return dp[num];
        
        // num�� ���� ��������, ���� ���峭 ���ڰ� ���ԵǾ� �־� ������ ���Ѹ� Integer.MAX_VALUE �� return �Ѵ�.
        dp[num] = count(num);
        // �μ������Ͽ� num = a * b �� ���·� ��ȯ
        for (int i = 1; i <= (int)Math.sqrt(num); i++) {
            if(num % i == 0) {
                int num1 = solve(i);
                int num2 = solve(num/i);
                // ���� ��ȣ�� ���� ���ڿ�, �μ������� a * b �� ���� �ٽ� Ž�� 
                // *�� ������ ������ +1 ���ش�.
                dp[num] = Math.min(dp[num], num1 == IMPOSSIBLE || num2 == IMPOSSIBLE ? IMPOSSIBLE : num1+num2 + 1);
            }
        }
        
        return dp[num];
    }
    
    static int count(int num) {
        int cnt = 0;
        System.out.println(num);
        while(num > 0) {
            int temp = num % 10;
            if(buttons[temp] == 0) return IMPOSSIBLE;
            
            num /= 10;
            cnt++;
        }
        return cnt;
    }
}