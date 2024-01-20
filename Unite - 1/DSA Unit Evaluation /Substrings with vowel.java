public static void solve(int n, String str){
    int count=0;
    
    for(int i=0; i<n; i++)
    {
        for(int j=i+1; j<=n; j++)
        {
            String z= str.substring(i,j);
            
            if(z.contains("a")||z.contains("e")||z.contains("i")||z.contains("o")||z.contains("u"))
            {
                count++;
            }
            else
            {
                break;
            }
            
        }
    }
    
    System.out.println(count);
  }
