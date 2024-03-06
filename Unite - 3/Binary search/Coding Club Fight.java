import java.util.*;
 
 public class Main {
     
     public static void main (String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int arr [] = new int [n];
         
         for(int a=0; a<n; a++)
         {
             arr[a] = sc.nextInt();
         }
         
         int q = sc.nextInt();
         
         
         
         for(int a=0; a<q; a++)
         {
             int count = 0;
             int sum = 0;
             int qu = sc.nextInt();
             
             for(int i=0; i<n; i++)
             {
                 if(arr[i]<=qu)
                 {
                     count++;
                     sum = sum + arr[i];
                 }
             }
             
             System.out.println(count+" "+sum);
         }
         
     }
 }
