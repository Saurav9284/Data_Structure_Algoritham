import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int k = sc.nextInt();
         
         int arr [] = new int [n];
         
         for(int i=0; i<n; i++)
         {
             arr[i] = sc.nextInt();
         }
         
         System.out.println(fun(arr,k));
     }
     
     static int fun(int arr [], int k){
         
         int i = 0;
         int j = arr.length-1;
         
         while(i<=j)
         {
             int mid = i + (j-i)/2;
             
             if(arr[mid]==k)
             {
                 return 1;
             }
             else if(arr[mid]<k)
             {
                 i = mid+1;
             }
             else
             {
                 j = mid-1;
             }
         }
         
         return -1;
     }
 }
