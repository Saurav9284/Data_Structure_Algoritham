public static void solve(int N, int arr[]){
       
       int x=0;
       int y=arr[0];
       
       for(int i=0; i<N; i++)
       {
           x=x+arr[i];
       }
       for(int j=1; j<N; j++ )
       {
           y=y*arr[j];
       }
       
       System.out.println((5*x)+(3*y));
  }
