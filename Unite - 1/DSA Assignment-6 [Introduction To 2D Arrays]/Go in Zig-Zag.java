public static void solve(int n,int m,int[][] arr){
       
       for(int i = 0; i < n; i++)
       {
           if(i%2==0)
           {
               for(int j = m-1; j >=0; j--)
               {
                   System.out.print(arr[i][j]+" ");
               }
           }
           else if(i%2!=0)
           {
               for(int k = 0; k < m; k++)
               {
                   System.out.print(arr[i][k]+" ");
               }
           }
       }
  }
