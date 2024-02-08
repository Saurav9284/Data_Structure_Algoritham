import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             int m = sc.nextInt();
             
             int arr [][] = new int [n][m];
             
             for(int i=0; i<n; i++)
             {
                 for(int j=0; j<m; j++)
                 {
                     arr[i][j] = sc.nextInt();
                 }
             }
             
             int count = 0;
             int sau = 0;
             int san = 0;
             int shu = arr[0].length-1;
             int mee = arr.length-1;
             int sat = n*m;
             
             while(count<sat)
             {
                 for(int i=sau, j=san; i<=mee; i++)
                 {
                     System.out.print(arr[i][j]+" ");
                     count++;
                 }
                 
                 san++;
                 
                 for(int i=mee,j=san; j<=shu; j++)
                 {
                     System.out.print(arr[i][j]+" ");
                     count++;
                 }
                 
                 mee--;
             }
             
             System.out.println();
             
         }
     }
 }
