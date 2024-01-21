public static void solve(int n,int m,char[][] arr){
      int v=0;
      int c=0;
      for(int i=0; i<n; i++)
      {
          for(int j=0; j<m; j++)
          {   
              char z = arr[i][j];
              if(z=='A'||z=='E'||z=='I'||z=='O'||z=='U')
              {
                  v++;
                  
              }
              else if(z!='A'||z!='E'||z!='I'||z!='O'||z!='U')
              {
                  c++;
              }
              
          }
      }
      
      System.out.println(6*c+9*v);
      
  }
