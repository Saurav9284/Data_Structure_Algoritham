public static void solve(int n,int[] arr){
    int count =0;
    
    if(arr[0]>arr[1])
    {
        count++;
    }
    for(int i=1; i<n-1; i++)
    {
        if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
        {
            count++;
        }
    }
    if(arr[n-1]>arr[n-2])
    {
        count++;
    }
    
    System.out.println(count);
  }

