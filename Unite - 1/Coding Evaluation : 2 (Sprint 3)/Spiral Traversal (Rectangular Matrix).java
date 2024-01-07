public static void solve(int N,int M,int[][] A){
    
      int top=0, bottom = N-1;
      int left=0, right= M-1;
      int direction=1;
      
      while(top<=bottom && left<=right)
      {
          
          if(direction==1)
          {
              for(int i=top; i<=bottom; i++)
              {
                  System.out.print(A[i][left]+" ");
              }
              
              left++;
              direction=2;
          }
          
          else if(direction==2)
          {
              for(int i=left; i<=right; i++)
              {
                  System.out.print(A[bottom][i]+" ");
              }
              
              bottom--;
              direction=3;
          }
          
          else if(direction==3)
          {
              for(int i=bottom; i>=top; i--)
              {
                  System.out.print(A[i][right]+" ");
              }
              
              right--;
              direction=4;
          }
          
          else if(direction==4)
          {
              for(int i=right; i>=left; i--)
              {
                  System.out.print(A[top][i]+" ");
              }
              
              top++;
              direction=1;
          }
      }
        
      System.out.println("");
       
  }
