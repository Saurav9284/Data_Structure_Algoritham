public static void oddSumInRows(int n,int m,int[][] arr){
     
      for(int i=0; i<n; i++)
      {
          int sum=0;
          for(int j=0; j<m; j++)
          {
              if(arr[i][j]%2!=0)
              {
                  sum=sum+arr[i][j];
              }
          }
          
          System.out.println(sum);
      }
  }
