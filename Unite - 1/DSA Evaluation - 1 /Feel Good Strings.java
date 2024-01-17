public static void solve(int n, String str){
     int count =0;
     for(int i=0; i<n; i++)
     {
         char z =str.charAt(i);
         
         if(z=='a'||z=='e'||z=='i'||z=='o'||z=='u')
         {
             count=count+1;
         }
     }
     
     if(count>=n/2)
     {
         System.out.println("Feel good!");
     }
     else
     {
          System.out.println("Feel bad!");
     }
  }
