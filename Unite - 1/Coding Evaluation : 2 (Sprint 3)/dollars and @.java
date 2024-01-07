public static void solve(int n){
     for(int i=1; i<=n; i++)
     {
      if(i%2==0)
      {
          System.out.print("@");
      }
         for(int j=1; j<=n; j++)
         {
             if(i%2!=0)
             {
                 System.out.print("$");
             }
         }
         System.out.println();
     }  
  }
