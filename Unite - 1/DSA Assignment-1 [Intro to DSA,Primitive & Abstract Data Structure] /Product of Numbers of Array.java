public static void solve(int N,int[] arr){
    int mul = 1;
    
    for(int i=0; i<N; i++)
    {
        mul = mul*arr[i];
    }
    
    System.out.println(mul);
  }
