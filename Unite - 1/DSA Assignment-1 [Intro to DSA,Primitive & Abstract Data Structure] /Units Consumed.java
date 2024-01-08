public static void unitsConsumed(int n){
    
     int orbill = n-80;
     
     if(orbill<=150)
     {
         System.out.println(orbill/3);
     }
     else if(orbill>150 && orbill<=650)
     {
         System.out.println(50+(orbill-150)/5);
     }
     else 
     {
         System.out.println(150+(orbill-650)/10);
     }
  }
