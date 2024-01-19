public static void solve(int n,int m,int[][] arr){
     
     
      for(int j = m-1; j >= 0; j--)
      {
          for(int i = 0; i < n; i++)
          {
              System.out.print(arr[i][j]+" ");
          }
      }
  }
