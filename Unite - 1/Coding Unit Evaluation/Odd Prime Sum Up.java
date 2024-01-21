public static void solve(int n){
     int sum =-2;
     
     for(int i=1; i<=n; i++)
     
     {    int factor =0;
     
         for(int j=1; j<=i; j++)
         {   
             
             if(i%j==0)
             {
                 factor++;
             }
         }
         
         if(factor==2)
         {
             sum=sum+i;
         }
     }
     
     System.out.println(sum);
  }
