public static void solve(int N){
    
    for(int i=1; i<=N; i++)
    {
        for(int j=1; j<=N; j++)
        {
            if(i==1 ||i==N||j==N)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        }
        
        System.out.println();
    }
  }
