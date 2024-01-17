public static void solve(int n, String str){
      
      int length = 0;
      for(int i=0; i<n; i++)
      {
          for(int j=i+1; j<=n; j++)
          {
              String a=str.substring(i,j);
              if(a.contains("a") ||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u"))
              {
                  break;
              }
              else 
              {           
                  if(a.length()>length)
                  {
                      length=a.length();
                  }
              }
          }
      }
      
      System.out.println(length);
      
  }
