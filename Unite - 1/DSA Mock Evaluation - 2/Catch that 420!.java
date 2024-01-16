public static void catch420(String s){
    int count = 0;
    for(int i = 0; i < s.length(); i++)
    {
      if(s.contains("420"))
      {
          count = count +1;
      }
    }
    if(count>=1)
    {
        System.out.println("Caught");
    }
    else
    {
        System.out.println("Escaped");
    }
  }
