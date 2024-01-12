public static void oddsOfOdds(int n,int[] arr){
      int count = 0;
      for(int i = 0; i < n; i++)
      {
          if(arr[i]%2!=0)
          {
              count = count + 1;
          }
      }
      
      if(count%2!=0)
      {
          System.out.println("Yes");
      }
      else
      {
          System.out.println("No");
      }
  }
