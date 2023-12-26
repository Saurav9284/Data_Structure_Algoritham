public static void solve(String S){
      
      StringBuilder ans = new StringBuilder();
      
      for(int i=0; i<S.length(); i++)
      {
          if(S.charAt(i)>='1' && S.charAt(i)<='9')
          {
              char ch= S.charAt(i-1);
              int time= S.charAt(i)-'0';
              
              for(int j=0; j< time; j++)
              {
                  ans.append(ch);
              }
          }
      }
      
      System.out.println(ans);
  }
