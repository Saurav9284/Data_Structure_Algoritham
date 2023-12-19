public static void areaAndPerimeter(int l1,int b1,int l2,int b2){
     
     int area1=l1*b1;
     int area2=l2*b2;
     
     int perimeter1=2*(l1+b1);
     int perimeter2=2*(l2+b2);
     
     if(area1>area2)
     {
         System.out.println("true");
     }
     else
     {
         System.out.println("false");
     }
     if(perimeter1>perimeter2)
     {
         System.out.println("true");
     }
     else
     {
         System.out.println("false");
     }
  }
