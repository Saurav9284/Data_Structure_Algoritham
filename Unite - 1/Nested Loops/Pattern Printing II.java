public static void patternPrinting(int N){
      
      for(int i=1; i<=N; i++)
    {
        for(int j=1; j<=N; j++)
        {
            if(i==N ||j==N||j==1)
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
