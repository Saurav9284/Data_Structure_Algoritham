import java.util.*;
 
 public class Main {
     
     public static void main(String [] args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int [][] arr = new int [n][n];
         
         for(int row=0; row<n; row++)
         {
             for(int col=0; col<n; col++)
             {
                 arr[row][col]=sc.nextInt();
             }
         }
         
         StringBuilder sb = new StringBuilder();
         
         for(int j=n-1; j>=0; j--)
         {
             for(int i=0; i<n; i++)
             {
                 sb.append(arr[i][j]+" ");
             }
             
             sb.append("\n");
         }
         
         System.out.println(sb);
     }
 }
