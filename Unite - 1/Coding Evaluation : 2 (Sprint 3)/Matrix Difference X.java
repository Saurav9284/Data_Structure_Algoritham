public static void solve(int n,int m,int[][] arr){
    
    int div = 0;
    int not = 0;
    
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            if(arr[i][j]%3==0)
            {
                div += arr[i][j];
            }
            
            if(arr[i][j]%5==0)
            {
                not += arr[i][j];
            }   
        }
    }
       System.out.println(div-not);
  }
