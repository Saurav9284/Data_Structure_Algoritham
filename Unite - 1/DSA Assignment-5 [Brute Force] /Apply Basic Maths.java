public static void applyBasicMaths(int N, int A[]){
    
    int sum = 0;
    int ans = -1;
    
    for(int i=0; i<N; i++)
    {
        sum += A[i];
    }
    
    int min = Integer.MAX_VALUE;
    
    int remove = sum%7;
    
    for(int i=0; i<N; i++)
    {
        if(A[i]%7==remove)
        {
            if(A[i]<min)
            {
                min=A[i];
                ans = i;
            }
        }
    }
    
    System.out.println(ans);
  }
