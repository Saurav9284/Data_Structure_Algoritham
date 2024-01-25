import java.util.*;
 
 public class Main{
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n= sc.nextInt();
         int m= sc.nextInt();
         
         int [][] arr = new int [n][m];
         
         int sum1=0,sum2=0;
         
         for(int a=0; a<n; a++)
         {
            for(int b=0; b<m; b++)
            {
                arr[a][b]=sc.nextInt();
            }
         }
         // sum 1
         
         for(int i=0; i<n; i++)
         { 
             for(int j=0; j<m;j++)
             {
                 if(i==0 && j>(m-1)/2 || i==n-1 && j<(m-1)/2)
                 {
                     sum1=sum1+ arr[i][j];
                 }
                 else if(j==(m-1)/2)
                 {
                    sum1=sum1+ arr[i][j];
                 }
             }
         }    
         
         // sum2
         
         for(int i=0; i<n; i++)
         { 
             for(int j=0; j<m;j++)
             {
                 if(j==m-1 && i>(n-1)/2 || j==0 && i<(n-1)/2)
                 {
                     sum2=sum2+ arr[i][j];
                 }
                 else if(i==(n-1)/2)
                 {
                    sum2=sum2+ arr[i][j];
                 }
             }
         } 
         
         System.out.println(sum1-sum2);
     }
 }
