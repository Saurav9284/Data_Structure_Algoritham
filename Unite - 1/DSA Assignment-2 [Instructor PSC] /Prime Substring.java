public static void solve(int N, String str){
    //write your code here
    int count=0;
    for(int i=0; i<N; i++)
    {    
        for(int j=i; j<=N; j++)
        {
            String substring= str.substring(i,j);
            
            int sublength = substring.length();
            
            
            int factor=0;
            
            for(int c=1; c<=sublength; c++)
            {
                if(sublength%c==0)
                {
                    factor++;
                }
            }
          
            if(factor==2)
            {
                count++;
            }
        }
    }
      System.out.println(count);
  }
