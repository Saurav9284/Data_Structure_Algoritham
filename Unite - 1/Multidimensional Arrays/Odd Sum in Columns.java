public static void oddSumColumns(int rows, int cols, int mat[][]){
       
       for(int j=0; j<cols; j++)
       {
           int sum=0;
           for(int i=0; i<rows; i++)
           {
               if(mat[i][j]%2!=0)
               {
                   sum=sum+mat[i][j];
               }
           }
           
           System.out.println(sum);
       }
  }
