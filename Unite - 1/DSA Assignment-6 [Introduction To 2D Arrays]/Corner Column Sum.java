public static void solve(int N,int M,int[][] arr){
    
    int sum = 0;
    for(int i = 0; i < N; i++)
    {
        for(int j = 0; j < M; j++ )
        {
            if(j==0 || j==M-1)
            {
                sum = sum + arr[i][j];
            }
        }
    }
    
    System.out.print(sum);
  }
