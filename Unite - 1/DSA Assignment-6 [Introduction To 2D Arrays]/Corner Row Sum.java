public static void solve(int N,int[][] arr){
    
     int sum = 0;
     
     for(int i = 0; i < N; i++)
     {
         for(int j=0; j<N; j++)
         {   
             if(i==0 || i==N-1)
             {
             sum= sum+arr[i][j];
             }
         }
         
     }
     
     System.out.print(sum);
  }
