public static void sumRelatedProblem(int n){
    int sum = 0;
    
    for(int i = 1; i <= n; i++)
    {
        if(i%2==0)
        {
            sum = sum + i;
        }
    }
    
    System.out.println(sum);
  }
