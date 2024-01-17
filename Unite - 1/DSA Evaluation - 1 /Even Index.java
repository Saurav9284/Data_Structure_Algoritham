public static void solve(int n, int arr[]){
    
    int mul = 0;
    
     for(int i=0; i<n; i++)
     {
         if(i%2==0)
         {
             mul=mul+i*arr[i];
         }
     }
     
     System.out.println(mul);
  }
