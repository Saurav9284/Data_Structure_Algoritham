public static void specificDiagonals(int n,int m,int[][] arr,int k){
    //write your code here
    
    int diff = 0;
    int sum = 0;
      for(int i = 0; i < n ; i++)
      {
          for(int j = 0 ; j < m; j++)
          {
              if(arr[i][j]==k)
              {
                  diff=i-j;
                  sum=i+j;
              }
          }
      }
      for(int i = 0; i < n; i++)
      {
          for(int j = 0 ; j < m; j++)
          {
              if(diff==(i-j))
              {
                  System.out.print(arr[i][j]+" ");
              }
          }
      }
      System.out.println();
      for(int i = 0 ; i < n ; i++)
      {
          for(int j = 0 ; j < m ; j++)
          {
              if(sum==(i+j))
              {
                  System.out.print(arr[i][j]+" ");
              }
          }
             
      }
  }
