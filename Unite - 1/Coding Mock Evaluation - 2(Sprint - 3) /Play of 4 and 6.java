public static void playOf4and6(int N){
    
      if(N%4==0 && N%6==0)
      {
          System.out.println("Awesome!");
      }
      else if(N%4==0)
      {
          System.out.println("Four!");
      }
      else if(N%6==0)
      {
          System.out.println("Six!");
      }
      else
      {
          System.out.println("Dark!");
      }
  }
