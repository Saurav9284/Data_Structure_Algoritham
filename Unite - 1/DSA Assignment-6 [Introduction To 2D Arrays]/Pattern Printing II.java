public static void patternPrinting(int n){
    
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(j==1 || i==n || j==n)
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
