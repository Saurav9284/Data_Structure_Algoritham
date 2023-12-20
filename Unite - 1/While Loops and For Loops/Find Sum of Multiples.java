
public static void findSumOfMultiples(int x,int k,int y){
    int sum=0;
    
    for(int i=1; i<=k; i++)
    {   int mul=x*i;
        if(mul%y==0)
        {
            sum=sum+mul;
        }
    }
    System.out.println(sum);
      
  }
