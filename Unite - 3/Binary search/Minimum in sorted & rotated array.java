import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int arr[] = new int [n];
         
         for(int i=0; i<n; i++)
         {
             arr[i] = sc.nextInt();
         }
         
         System.out.println(fun(arr));
     }
     
     static int fun(int arr[]){
         
         int i = 0;
         int j = arr.length-1;
         
         while(i<j)
         {
             int mid = i + (j-i)/2;
             
             if(arr[mid]>arr[j])
             {
                 i = mid+1;
             }
             
             else
             {
                 j = mid;
             }
         }
         
         return arr[i];
     }
 }
