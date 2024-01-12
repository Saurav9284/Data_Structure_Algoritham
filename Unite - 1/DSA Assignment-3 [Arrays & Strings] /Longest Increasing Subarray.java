public static void longestIncreasingSubarray(int n,int[] arr){
    
      int max = 1; 
        
        int curr = 1;
        
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > arr[i - 1]) 
            {
                curr++;
                max = Math.max(max, curr);
            }
            else
            {
                curr = 1; 
            }
        }

        System.out.println(max);
    }
