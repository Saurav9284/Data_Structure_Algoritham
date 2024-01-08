public static void battleOfOddAndEven(int n, int arr[]){
    
     int sumeven = 0;
     int sumodd = 0;
     
       for(int i=0; i<n; i++)
       {
           if(arr[i]%2==0)
           {
               sumeven=sumeven+arr[i];
           }
           else
           {
               sumodd=sumodd+arr[i];
           }
       }
       
       if(sumodd>sumeven)
       {
           System.out.println("Odd");
       }
       else
       {
           System.out.println("Even");
       }
  }
