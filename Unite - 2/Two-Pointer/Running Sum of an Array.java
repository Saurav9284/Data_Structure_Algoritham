import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             
             int [] arr = new int [n];
             
             for(int p=0; p<n; p++)
             {
                 arr[p]= sc.nextInt();
             }
             
             int i=0;
             int sum =0;
             
             while(i<n)
             {
                 sum = sum + arr[i];
                 
                 System.out.print(sum+" ");
                 
                 i++;
             }
             
             System.out.println();
             
         }
     }
 }
