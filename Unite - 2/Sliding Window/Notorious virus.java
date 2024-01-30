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
         
         int max = Integer.MIN_VALUE;
         
         int sum = 0;
         
         int maxvalue = Integer.MIN_VALUE;
         
         for(int i=0; i<n; i++)
         {
             sum = sum + arr[i];
             
             if(arr[i]>maxvalue)
             {
                 maxvalue = arr[i];
             }
             
             if(sum-maxvalue>max)
             {
                 max = sum - maxvalue;
             }
             
             if(sum<0)
             {
                 sum = 0;
                 maxvalue = Integer.MIN_VALUE;
             }
         }
         
         System.out.println(max);
     }
 }
