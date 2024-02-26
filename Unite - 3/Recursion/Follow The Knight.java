    import java.io.*;
  
    import java.lang.*;
  
    import java.util.*;
  
  public class Main{
      
    static int [][] board = new int[10][10];
    
    public static void function (int [][] board, int x, int y, int n){
        
        if(x<0 || x>9 || y<0 || y>9)
        {
            return ;
        }
        if(n==0)
        {
            board [x][y] = 1;
            return ;
        }
        
         function (board , x-1, y+2, n-1);
         function (board , x-1, y-2, n-1); 
         function (board , x+1, y+2, n-1);
         function (board , x+1, y-2, n-1);
         function (board , x+2, y+1, n-1);
         function (board , x+2, y-1, n-1);
         function (board , x-2, y+1, n-1);
         function (board , x-2, y-1, n-1);
   }
   
   public static int count(){
       
       int count = 0;
       
       for(int i=0; i<10; i++)
       {
          for(int j=0; j<10; j++) 
          {
              if(board[i][j] == 1) 
              {
                  count++;
              }
          }
       }  
          return count;
 }
       public static void main ( String [] args){
           
           Scanner sc = new Scanner(System.in);
           
           int x = sc.nextInt()-1;
           
           int y = sc.nextInt()-1;
           
           int n = sc.nextInt();
           
           function(board,x,y,n);
           
           System.out.println(count());
       }
   }
