public static void countPossiblePairs(int N, int M){
    //write your code here
    
    int count = 0;
    
    for(int x = 0; x*x <= N; x++)
    {
        for(int y = 0; y*y <= M; y++)
        {
            if(x*x + y == N && y*y + x == M)
            {
                count++;
            }
        }
    }
    
    System.out.println(count);
  }
