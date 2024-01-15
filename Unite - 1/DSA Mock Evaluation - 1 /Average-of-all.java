public static void averageOfAll(int n, int arr[]){
      
     int sum=0;
     
     for(int i=0; i<n; i++)
     {
         sum=sum+arr[i];
     }
     
     System.out.println(sum/n);
  }
