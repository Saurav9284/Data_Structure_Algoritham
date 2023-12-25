public static void enoughFuel(int fuel,int distance){
         
          int req=fuel*distance;
          
          if(req>50)
          {
              System.out.println("Enough");
          }
          else
          {
              System.out.println("Go On");
          }
    }
