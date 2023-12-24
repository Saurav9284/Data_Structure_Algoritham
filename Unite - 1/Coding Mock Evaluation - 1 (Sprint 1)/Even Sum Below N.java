public static void evensum(int num){
     
      int sum=0;
    for(int i=0; i<=num; i++)
    {
        if(i%2==0){
            sum=sum+i;
        }
    }
        System.out.println(sum);
  }
