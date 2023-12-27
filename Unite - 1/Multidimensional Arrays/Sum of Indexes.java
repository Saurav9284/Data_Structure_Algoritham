public static void sumOfIndexes(int rows, int cols, int mat[][]){
      
      for(int i=0; i<rows; i++)
      {
          int sum = 0;
          
          for(int j=0; j<cols; j++)
          {
              sum=i+j;
              System.out.print(sum+" ");
          }
          
          System.out.println();
          
      }
  }
