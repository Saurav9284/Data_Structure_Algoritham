public static void solve(int N, String str){
    int sum=0;
    int sum1=0;
    
     for(int i=0; i<N; i++)
     {
         if(str.charAt(i)=='a'||str.charAt(i)=='b'||str.charAt(i)=='c'||str.charAt(i)=='d'||str.charAt(i)=='e'||str.charAt(i)=='f'||str.charAt(i)=='g'||str.charAt(i)=='h'||str.charAt(i)=='i'||str.charAt(i)=='j'||str.charAt(i)=='k'||str.charAt(i)=='l'||str.charAt(i)=='m'||str.charAt(i)=='n'||str.charAt(i)=='o'||str.charAt(i)=='p'||str.charAt(i)=='q'||str.charAt(i)=='r'||str.charAt(i)=='s'||str.charAt(i)=='t'||str.charAt(i)=='u'||str.charAt(i)=='v'||str.charAt(i)=='w'||str.charAt(i)=='x'||str.charAt(i)=='y'||str.charAt(i)=='z')
         {
             sum=sum+1;
         }
         else
         {
             sum1=sum1+1;
         }
     }
     
     System.out.println((5*sum)+(3*sum1));
  }
