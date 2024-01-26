import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             
             int k = sc.nextInt();
             
             int [] arr = new int [n];
             
             for(int i=0; i<n; i++)
             {
                 arr[i]=sc.nextInt();
             }
             
             long [] array = new long [n];
             
             k=k%n;
             
             for(int j=0; j<n; j++)
             {
                 array[k]=arr[j];
                 
                 k=(k+1)%n;
             }
             
             for(int l=0; l<n; l++)
             {
                 System.out.print(array[l]+" ");
             }
             
             System.out.println();
         }
     }
 }
