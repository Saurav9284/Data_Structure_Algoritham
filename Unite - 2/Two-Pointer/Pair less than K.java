import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             
             int [] arr = new int [n];
             
             for(int i=0; i<n; i++)
             {
                 arr[i] = sc.nextInt();
             }
             
             int k = sc.nextInt();
             
             Arrays.sort(arr);
             
             int i=0;
             int j=n-1;
             int ans = -1;
             
             while(i<j)
             {
                 int sum = arr[i]+arr[j];
                 
                 if(sum<k)
                 {
                     ans = Math.max(ans,sum);
                     i++;
                 }
                 else
                 {
                     j--;
                 }
                 
                 
             }
             
             System.out.println(ans);
         }
     }
 }
