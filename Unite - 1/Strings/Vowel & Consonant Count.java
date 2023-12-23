public static void vowelAndConsonantCount(int n, String str){
       
       int count=0;
       int count1=0;
       
       for(int i=0; i<n; i++)
       {
           char z=str.charAt(i);
           
           if(z=='a'||z=='e'||z=='i'||z=='o'||z=='u')
           {
               count++;
           }
           else
           {
               count1++;
           }
       }
       
       System.out.print(count+" "+count1);
  }
