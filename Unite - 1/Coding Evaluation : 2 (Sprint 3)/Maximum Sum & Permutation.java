public static void solve(int n, int arr[]){
    int sum=0;
    Arrays.sort(arr);
    for(int i=0; i<n; i++)
    {
        sum=sum+arr[i]*i;
    }
    System.out.println(sum);
  }
