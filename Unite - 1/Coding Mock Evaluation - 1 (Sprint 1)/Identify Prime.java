public static void identifyPrime(int num){
    
    int factor = 0;
    
     for(int i=1; i<=num; i++)
     {
         if(num%i==0)
         {
             factor++;
         }
     }
     if(factor==2)
     {
         System.out.println("Yes");
     }
     else
     {
         System.out.println("No");
     }
  }
