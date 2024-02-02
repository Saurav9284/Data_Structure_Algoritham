import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int arr [] = new int [2*n];
         
         for(int i=0; i<2*n; i++)
         {
             arr[i] = sc.nextInt();
         }
         
         Arrays.sort(arr);
         
         int total = 0;
         
         for(int i=n; i<2*n; i++)
         {
                 total = total + arr[i];
         }
         
         System.out.println(total);
     }
 }
