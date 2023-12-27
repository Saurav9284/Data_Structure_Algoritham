public static void array2D(int rows, int cols, int mat[][]){
      
      for(int i=0; i<rows; i++)
      {
          for(int j=0; j<cols; j++)
          {
              System.out.print(mat[i][j]+" ");
          }
          
          System.out.println();
      }
  }
