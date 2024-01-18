public static void competeWithNeighbour(int N, int A[]){
    
      int count = 0;
      
      if(A[0]>A[1])
      {
          count++;
      }
      
      for(int i = 1; i < N-1; i++)
      {
          if(A[i]>A[i+1] && A[i]>A[i-1])
          {
              count++;
          }
      }
      
      if(A[N-1]>A[N-2])
      {
          count++;
      }
      
      System.out.println(count);
  }
