public static void identifyPrime(int num){
      
      int count=0;
      
      for(int i=1; i<=num; i++)
      {
          if(num%i==0)
          {
              count=count+1;
          }
      }
      if(count==2)
      {
          System.out.println("Yes");
      }
      else
      {
          System.out.println("No");
      }
       
  }
