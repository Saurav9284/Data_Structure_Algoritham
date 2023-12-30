public static void oddSumInColumns(int n,int m,int[][] arr){
      
      for(int j=0; j<m; j++)
      {
          int sum=0;
          for(int i=0; i<n; i++)
          {
              if(arr[i][j]%2!=0)
              {
                  sum=sum+arr[i][j];
              }
          }
          
          System.out.println(sum);
      }
  }
