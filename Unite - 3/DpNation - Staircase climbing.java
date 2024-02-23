import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
         int t = sc.nextInt();
        
         for(int a=0; a<t; a++)
         {
            int n = sc.nextInt(); 
            
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt(); 
            }
            
            System.out.println(myFun(arr,n));
        }
    }
    private static int myFun(int[] arr, int n) {
        
        int[] dp = new int[n];
        
        if(n == 1)
        {
          return arr[0];  
        } 
        
        dp[0] = arr[0];
        dp[1] = arr[1];
        
        for(int i = 2; i < n; i++)
        {
            dp[i] = arr[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
