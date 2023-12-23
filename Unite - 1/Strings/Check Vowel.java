public static void checkVowel(int n, String str){
      
      int count = 0;
      for(int i=0; i<n; i++)
      {   
          char z = str.charAt(i);
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
