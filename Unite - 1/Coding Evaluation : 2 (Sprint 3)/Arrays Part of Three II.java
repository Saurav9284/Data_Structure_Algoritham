public static void solve(int N, int a[]){
    
     
     int c1=0;
     int c2=0;
     int c3=0;
     
     int length = N/3;
     
     for(int i=0; i<length; i++)
     {
         c1=c1+a[i];
     }
     
     for(int k=length; k<2*length; k++)
     {
         c2=c2+a[k];
     }
     
     for(int j=2*length; j<N; j++)
     {
         c3=c3+a[j];
     }
     
     System.out.print(4*c1 + 5*c2 + 6*c3);
  }
