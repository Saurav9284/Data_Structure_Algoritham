public static void vowelsInRows(int rows, int cols, char mat[][]){
        
        for(int i=0; i<rows; i++)
        {
            int count=0;
            
            for(int j=0; j<cols; j++)
            {
                if(mat[i][j]=='a' || mat[i][j]=='e' || mat[i][j]=='i' || mat[i][j]=='o' || mat[i][j]=='u')
                {
                    count++;
                }
                
            }
            if(count>=1)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
        }
  }
