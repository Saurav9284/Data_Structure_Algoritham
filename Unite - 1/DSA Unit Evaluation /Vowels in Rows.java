public static void solve(int n,int m,char[][] arr){
      
      for(int i=0; i<n; i++)
      {  int count=0;
          for(int j=0; j<m; j++)
          {
              if(arr[i][j]=='a'||arr[i][j]=='e'||arr[i][j]=='i'||arr[i][j]=='o'||arr[i][j]=='u')
              {
                  count++;
              }
          }
          
          if(count>=1)
          {
              System.out.println("Yes");
          }
          else
          {
              System.out.println("No");
          }
      }
  }
