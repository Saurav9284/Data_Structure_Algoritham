import java.util.*;
 
 public class Main {
     
     public static void main(String [] args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         System.out.println(function(n));
     }
     
     static int function(int n){
         
         if(n==1 || n==0)
         {
             return 1;
         }
         
         int ans = n * function(n-1);
         
         return ans;
     }
 }
