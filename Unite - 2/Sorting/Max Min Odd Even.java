import java.util.*;
 
 class Main {
     
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
             
             int mineven = Integer.MAX_VALUE;
             int maxodd = 0;
             
             for(int i=0; i<n; i++)
             {
                 if(arr[i]%2==0 && arr[i]<mineven)
                 {
                     mineven = arr[i];
                 }
                 else if(arr[i]%2!=0 && arr[i]>maxodd)
                 {
                     maxodd = arr[i];
                 }
             }
             
             System.out.println(maxodd - mineven);
         }
     }
 }
