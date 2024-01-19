
public static void solve(int n,int m,int[][] arr){
    
    
     for(int i = 0; i < m; i++)
     {
         for(int j = n-1; j>=0; j--)
         {
             System.out.print(arr[j][i]+ " ");
         }
     }
  }
