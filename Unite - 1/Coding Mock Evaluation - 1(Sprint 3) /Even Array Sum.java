public static void evenArraySum(int n, int arr[]){
    
      int sum=0;
      
      for(int i=0; i<n; i++)
      {
          if(arr[i]%2==0)
          {
              sum=sum+arr[i];
          }
      }
      
      System.out.println(sum);
  }
