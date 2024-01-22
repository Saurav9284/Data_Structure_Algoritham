import java.util.*;
 
 public class Main{
     
     public static void main(String[]argd){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int i=0; i<t; i++)
         {
             int n = sc.nextInt();
             
             int[]array = new int[n];
             
             for(int j=0; j<n; j++)
             {
                 array[j]=sc.nextInt();
                 
                 System.out.print(array[j]+1+" ");
             }
             
             System.out.println();
             
         }
     }
 }
