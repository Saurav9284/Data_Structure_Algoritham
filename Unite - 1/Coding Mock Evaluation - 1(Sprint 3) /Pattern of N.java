public static void patternOfN(int N){
    int num=1;
    
     for(int i=1; i<=N; i++)
     {
         for(int j=1; j<=N; j++)
         {
             System.out.print(num+" ");
             num++;
         }
         
         System.out.println();
     }
  }
