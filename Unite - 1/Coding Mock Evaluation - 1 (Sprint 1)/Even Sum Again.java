public static void evensum(int num){
     
      for(int i=1; i<=num; i++)
    {   int even=0;
        for(int j=1;j<=i;j++)
        {
            if(j%2==0){
                even=even+j;
                
            }
        }
        System.out.println(even);
    }
  }
