public static void checkPalindrome(int n, String str){
      
      String reverse="";
      
      for(int i=n-1; i>=0; i--)
      {
          reverse=reverse+str.charAt(i);
      }
      if(str.equals(reverse))
      {
          System.out.println("Yes");
      }
      else
      {
          System.out.println("No");
      }
  }
