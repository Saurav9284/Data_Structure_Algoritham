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
         
         int max = 0;
         int count = 0;
         int flag = 0;
         
         for(int i=0; i<n; i++)
         {
             int sum = 0;
             
             for(int j=i; j<n; j++)
             {
                 sum = sum + arr[j];
                 
                 if(sum%k!=0)
                 {
                     int length = j-i+1;
                 if(length==n)
                 {
                     flag = 1;
                     count = 1;
                     break;
                 }
                 
                 if(length>max)
                 {
                     max = length;
                     count = 1;
                 }
                 
                 else if(length==max)
                 {
                     count++;
                 }
                 
                }
             }
             
            if(flag==1)
            {
               break;
            }
         }
         
         System.out.println(count);
     }
 }
