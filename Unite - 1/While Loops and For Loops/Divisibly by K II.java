public static void divisibleByK(int num,int k){
      
      int sum=0;
      
      for(int i=1; i<=num; i++)
      {
          if(i%k==0)
          {
              sum=sum+i;
          }
      }
      
      System.out.println(sum);
    
  }
