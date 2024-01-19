public static void solve(int n,int[][] arr){
    //write your code here
    for(int i = n-1; i >=0; i--)
    {
        for(int j = 0; j < n; j++)
        {
            System.out.print(arr[j][i]+" ");
        }
        
        System.out.println();
    }
  }
