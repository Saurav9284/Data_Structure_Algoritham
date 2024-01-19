public static void solve(int N,int M,int[][] arr){
    //write your code here
     int sum =0;
       int factor =0;
       for(int i=0; i < N ; i++)
       {
           for(int j =0 ; j < M; j++)
           {
               sum=sum+arr[i][j];
               
           }
       }
       
       for(int i = 1; i <= sum; i++)
       {
           if(sum%i==0)
               {
                   factor++;
               }
       }
             if(factor==2)
               {
                   System.out.println("true");
               }
               else
               {
                   System.out.println("false");
               }
  }
