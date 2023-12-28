public static void solve(int N, String str){
     int count=0;
     
     for(int i=0; i<N; i++)
     {
         char z=str.charAt(i);
         if(z=='a'||z=='e'||z=='i'||z=='o'||z=='u')
         {
             count++;
         }
     }
     if(count>=1)
     {
         System.out.println("true");
     }
     else
     {
         System.out.println("false");
     }
  }
