import java.util.*;
 
  public class Main {
      
      public static void main(String []argd){
          
          Scanner sc = new Scanner(System.in);
          
           int n = sc.nextInt();
           int m = sc.nextInt();
          
          int [][]array = new int [n][m];
          
          for(int i=0; i<n; i++)
          {
              for(int j=0; j<m; j++)
              {
                  array[i][j]=sc.nextInt();
                  
                  System.out.print(array[i][j]+1+" ");
              }
              
              System.out.println();
          }
      }
  }
