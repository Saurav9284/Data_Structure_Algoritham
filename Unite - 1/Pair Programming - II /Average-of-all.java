public static void averageOfAll(int n,int[] arr){
          
          int sum = 0;
          
          for(int i=0; i<n; i++)
          {
              sum=sum+arr[i];
          }
          int average= sum/n;
          
          System.out.println(average);
          
  }
