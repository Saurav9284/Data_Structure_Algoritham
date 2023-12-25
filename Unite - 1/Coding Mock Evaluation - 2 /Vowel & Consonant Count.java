public static void vowelAndConsonantCount(int n, String str){
      
      int count=0;
      int count1=0;
      
       for(int i=0; i<n; i++)
       {
           char z=str.charAt(i);
           if(z=='a'|| z=='e'|| z=='i'|| z=='o'|| z=='u')
           {
               count=count+1;
           }
           else
           {
               count1=count1+1;
           }
       }
       
       System.out.println(count+" "+count1);
  }
