public static void solve(int a, int b, int c){
    int h=a*a;
    int l=b*b;
    int hy=c*c;
    
       if(h+l==hy || h+hy==l ||hy+l==h )
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }
  }
