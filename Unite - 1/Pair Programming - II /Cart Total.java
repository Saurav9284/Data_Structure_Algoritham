public static void cartTotal(int n,int[] price,int[] quantity){
     
     int total = 0;
     
     for(int i=0; i<n; i++)
     {
         total=total+price[i]*quantity[i];
     }
     
     System.out.println(total);
  }
