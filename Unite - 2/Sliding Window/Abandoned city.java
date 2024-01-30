import java.util.*;
 
 class Main {
     
     public static void main(String [] args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             
             int k = sc.nextInt();
             
             int [] arr = new int [n];
             
             for(int i=0; i<n; i++)
             {
                 arr[i] = sc.nextInt();
             }
             
             int sum = 0;
             
             int min = Integer.MAX_VALUE;
             
             int j = 0;
             
             for(int i=0; i<n; i++)
             {
                 sum = sum + arr[i];
                 
                 while(sum>=k)
                 {
                     min = Math.min(min, i-j+1);
                     
                     sum = sum - arr[j];
                     
                     j++;
                 }
             }
             
             if(min != Integer.MAX_VALUE)
             {
                 System.out.println(min);
             }
             else
             {
                 System.out.println(-1);
             }
         }
     }
 }
