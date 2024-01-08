public static void equalOrNot(int n,int[] arr){
     int present = 0;
     
     for(int i = 0; i < n; i++)
     {
         if(arr[i]==42)
         {
             present=present+1;
         }
     }
     
     if(present>=1)
     {
         System.out.println("Yes");
     }
     else
     {
         System.out.println("No");
     }
  }
