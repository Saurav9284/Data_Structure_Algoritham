public static void decompressTheString(String a){
    
    StringBuilder ans = new StringBuilder();
      
      for(int i=0; i<a.length(); i++)
      {
          if(a.charAt(i)>='1' && a.charAt(i)<='9')
          {
              char ch= a.charAt(i-1);
              int time= a.charAt(i)-'0';
              
              for(int j=0; j< time; j++)
              {
                  ans.append(ch);
              }
          }
      }
      
      System.out.println(ans);
  
  }
