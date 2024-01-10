public static void detectPalindrome(String s){
     
     String reverse = "";
     
     for(int i=s.length()-1; i>=0; i--)
     {
         reverse=reverse+s.charAt(i);
     }
     
     if(s.equals(reverse))
     {
         System.out.println("Yes");
     }
     else
     {
         System.out.println("No");
     }
  }
