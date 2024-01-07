public static void solve(int n, String str){
    //write your code here
    
    String ans="";
    
    for(int i=1; i<=n; i++)
    {
        if(i%3==0)
        {
            for(int j=i-1; j>=i-3; j--)
            {
                ans=ans+str.charAt(j);
            }
        }
    }
    
    System.out.println(ans);
  }
