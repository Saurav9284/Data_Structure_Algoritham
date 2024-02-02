import java.util.*;
 
 class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             
             int m = sc.nextInt();
             
             int [] arr = new int [n];
             
             for(int i=0; i<n; i++)
             {
                 arr[i] = sc.nextInt();
             }
             
             for(int i=0; i<n-1; i++)
             {
                 int min = i;
                 
                 for(int j=i+1; j<n; j++)
                 {
                     if(arr[j]<arr[min])
                     {
                         min = j;
                     }
                 }
                 
                 int temp = arr[i];
                 arr[i] = arr[min];
                 arr[min] = temp;
             }
             
             int min = 0;
             int max = 0;
             
             // min sum //
             
             for(int i=0; i<n-m; i++)
             {
                 min = min + arr[i];
             }
             
             // max sum //
             
             for(int i=m; i<n; i++)  //for(int i=n-1; i>=m; i--)//
             {
                 max = max + arr[i];
             }
             
             int diff = max - min;
             
             System.out.println(diff);
         }
     }
 }
