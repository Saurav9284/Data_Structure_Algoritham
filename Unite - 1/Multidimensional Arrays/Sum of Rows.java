public static void sumOfRows(int rows, int cols, int mat[][]){
    
     for(int i=0; i<rows; i++)
     {
         int sum =0;
         
         for(int j=0; j<cols; j++)
         {
             sum=sum+mat[i][j];
         }
         
         System.out.println(sum);
     }
  }
