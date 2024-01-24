import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int z=0; z<t; z++)
         {
             int n = sc.nextInt();
             int m = sc.nextInt();
             
            int[][] array = new int [n][m];
            
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<m; j++)
                {
                    array[i][j]=sc.nextInt();
                }
            }
            
            int max= 0;
            int row= 1;
            
            for(int r=0; r<n; r++)
            {   
                int count=0;
                
                for(int c=0; c<m; c++)
                {
                    if(array[r][c]==1)
                    {
                        count++;
                    }
                    if(count>max)
                    {
                        max=count;
                        row=r+1;
                    }
                    
                }
                
            }
            
            System.out.println(row);
            
         }
      
     }
 }
