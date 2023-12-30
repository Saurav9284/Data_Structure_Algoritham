public static void oddSumAgain(int num){
      
      for(int i=1; i<=num; i++)
      {   
          int sum=0;
          for(int j=1; j<=i; j++)
          {
              if(j%2!=0)
              {
                  sum=sum+j;
              }
          }
          
          System.out.println(sum);
      }
  }
