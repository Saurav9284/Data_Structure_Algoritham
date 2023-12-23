public static void checkPalindrome(int n, String str){
     
     String rev="";
     
     for(int i=n-1; i>=0; i--)
     {
         rev=rev+str.charAt(i);
     }
     
     if(str.equals(rev))
     {
         System.out.println("Yes");
     }
     else
     {
         System.out.println("No");
     }
  }
