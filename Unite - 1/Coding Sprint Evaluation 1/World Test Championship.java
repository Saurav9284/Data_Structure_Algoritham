public static void productOfSeven(int IndPoints, int AusPoints, int IndMatches, int AusMatches){
      
      if(IndPoints>AusPoints)
      {
          System.out.println("India");
      }
      if(AusPoints>IndPoints)
      {
          System.out.println("Australia");
      }
      if(IndPoints==AusPoints && IndMatches<AusMatches)
      {
          System.out.println("India");
      }
      if(IndPoints==AusPoints && AusMatches<IndMatches)
      {
          System.out.println("Australia");
      }
      if(IndPoints==AusPoints && AusMatches==IndMatches)
      {
          System.out.println("Play another game!");
      }
  }
