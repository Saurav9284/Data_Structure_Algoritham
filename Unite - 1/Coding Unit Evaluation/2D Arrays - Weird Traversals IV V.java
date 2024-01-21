  public static void solve(int n,int[][] arr){
     
     int c1 = 0;
     int c2 = 0;
     int c3 = 0;
     
     for(int i=n/2+1; i<n; i++)
     {
         c1 = c1 + arr[0][i];
     }
     
     //System.out.println(c1);
     
     for(int i=0; i<n; i++)
     {
         c2 = c2 + arr[i][n/2];
     }
     
     //System.out.println(c2);
     
     for(int i=0; i<n/2; i++)
     {
         c3 = c3 + arr[n-1][i];
     }
     
     System.out.println(5*c1+3*c2+2*c3);
  }
