public static void solve(int N, int height[]){

       if(height[0]>height[1])
       {
           System.out.print("1 ");
       }
       else
       {
           System.out.print("0 ");
       }
       
       for(int i=1; i<N-1; i++)
       {
           if(height[i]>height[i-1] && height[i]>height[i+1])
           {
               System.out.print("2 ");
           }
           else if(height[i]>height[i-1] || height[i]>height[i+1])
           {
               System.out.print("1 ");
           }
           else
           {
               System.out.print("0 ");
           }
       }
       
       if(height[N-1]>height[N-2])
       {
           System.out.println("1 ");
       }
       else
       {
           System.out.println("0");
       }
  }
