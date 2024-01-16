public static void solve(int N, int A[]){
    
    int count = 0;
    
    for(int i=0; i<N; i++)
    {   
        for(int j=i; j<N; j++)
        {
            boolean contain = false; 
            
            for(int k=i; k<=j; k++)
            {
                if(A[k]==10)
                {
                    contain = true;
                    break;
                }
            }
            
            if(contain)
            {
                count++;
            }
        }
    
    }
    
    System.out.print(count);
    
  }
