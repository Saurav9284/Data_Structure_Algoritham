import java.util.*;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int minPt = sc.nextInt();
        
        sc.nextLine();
        
        String[] groupSt = sc.nextLine().split(" ");
        String[] profitSt = sc.nextLine().split(" ");
        
        int[] group = new int[groupSt.length];
        int[] profit = new int[profitSt.length];
        
        
        for(int i=0;i<group.length;i++){
            
            group[i] = Integer.parseInt(groupSt[i]);
            profit[i] = Integer.parseInt(profitSt[i]);
        }
        
        int result = profit(n, minPt, group, profit); 
        
        System.out.println(result);
    }
    
    public static int profit(int n, int minPt, int[] group, int[] profit) {
        
        final int MOD = 1_000_000_007;
        
        int[][][] dp = new int[group.length + 1][n+1] [minPt + 1];
        
        dp[0][0][0] = 1;
        
        for (int i = 1; i <= group.length; i++) {
            
            int member = group[i - 1], gain = profit[i - 1];
            
            for (int j = 0; j <= n; j++) {
                
                for (int k = 0; k <= minPt; k++) {
                    
                    dp[i][j][k] = dp[i - 1][j][k];
                    
                    if (j >= member) {
                        
                        dp[i][j][k] += dp[i - 1][j - member][Math.max(0, k - gain)];
                        dp[i][j][k] %= MOD;
                    }
                }
            }
        }
        
        int sum = 0;
        
        for (int j = 0; j <= n; j++) {
            sum = (sum + dp[group.length][j] [minPt]) % MOD;
        }
        
        return sum;
    }
}
