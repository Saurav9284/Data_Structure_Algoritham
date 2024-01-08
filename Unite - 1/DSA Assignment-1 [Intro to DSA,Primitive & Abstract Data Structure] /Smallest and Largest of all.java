public static void smallestAndLargest(int n,int[] arr){
      
      int small = arr[0];
      int large = arr[0];
      
      for(int i = 0; i < n; i++)
      {
          if(arr[i]<small)
          {
              small=arr[i];
          }
          else if(arr[i]>large)
          {
              large=arr[i];
          }
      }
      
      System.out.println(small);
      System.out.println(large);
  }
