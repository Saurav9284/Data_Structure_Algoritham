public static void solve(int N, int arr[]){
     
    int c1=0;
    int c2=0;
    int c3=0;
    int c4=0;
    
    int length = N/4;
    
    for(int i=0; i<length; i++)
    {
        c1=c1+arr[i];
    }
    
    for(int j=length; j<2*length; j++)
    {
        c2=c2+arr[j];
    }
    
    for(int k=2*length; k<3*length; k++)
    {
        c3=c3+arr[k];
    }
    
    for(int l=3*length; l<N; l++)
    {
        c4=c4+arr[l];
    }
    
    System.out.print(17*c1 + c2 + 7*c3 +c4);
  }
