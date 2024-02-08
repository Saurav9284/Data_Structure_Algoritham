import java.util.*;
 
 class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int m = sc.nextInt();
         
         int [][] arr = new int [n][m];
         
         int Matrix1 = 0;
         
         for(int i=0; i<n; i++)
         {
             for(int j=0; j<m; j++)
             {
                 arr[i][j] = sc.nextInt();
                 
                 Matrix1 = Matrix1 + arr[i][j];
             }
         }
         
         int i = sc.nextInt();
         
         int j = sc.nextInt();
         
         int [][] ar = new int [i][j];
         
         int Matrix2 = 0;
         
         for(int p=0; p<i; p++)
         {
             for(int q=0; q<j; q++)
             {
                 ar[p][q] = sc.nextInt();
                 
                 Matrix2 = Matrix2 +ar[p][q];
             }
         }
         
         int ans = 0;
         
         if(Matrix1>Matrix2)
         {
             ans = Matrix1;
         }
         else
         {
             ans = Matrix2;
         }
         
         System.out.print(ans);
     }
 }
