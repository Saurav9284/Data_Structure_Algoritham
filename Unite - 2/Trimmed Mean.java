import java.util.*;
 
 class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             
             int judge = 5*n;
             
             int [] arr = new int [judge];
             
             for(int i=0; i<judge; i++)
             {
                 arr[i] = sc.nextInt();
             }
             
             Arrays.sort(arr);
             
             int sum = 0;
             int div = (judge-n)-n;
             
             for(int i=n; i<judge-n; i++)
             {
                 sum = sum + arr[i];
             }
             
             System.out.println(sum/div);
        
         }
     }
 }
