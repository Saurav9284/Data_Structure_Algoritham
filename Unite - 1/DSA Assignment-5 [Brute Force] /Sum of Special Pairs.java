public static void sumOfSpecialPairs(int N, int A[]){
    
      int sum = 0; 
      
      for(int i = 0; i < N; i++)
      {
          for(int j = i+1; j < N; j++)
          {
              int num = j-i;
            
             if(isPrime(num))
             {
              sum = sum + Math.abs(A[j]-A[i]);
             }
          }
      }
      
      System.out.println(sum);
  }
      
      public static boolean isPrime(int n)
      {
          int factor = 0;
          
          for(int i= 1; i <=n ; i++)
          {
              if(n%i==0)
              {
                  factor++;
              }
          }
          
          if(factor==2)
          {
              return true;
          }
          else
          {
              return false;
          }
      }
