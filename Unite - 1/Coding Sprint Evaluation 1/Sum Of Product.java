public static void solve(int N, int arr[]){
     
     int z =0;
     
     for(int i=0; i<N; i++)
     {
         z= z+arr[i]*(i+1);
         
     }
     
     System.out.println(z);
  }
