import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int arr [] = new int [n];
         
         for(int i=0; i<n; i++)
         {
             arr[i] = sc.nextInt();
         }
         
         print(arr,0);
     }
     
     static void print(int arr [] , int index){
         
         if(index>=arr.length)
         {
             return;
         }
         
         if(isodd(arr[index]))
         {
             System.out.println(arr[index]);
         }
         
         print(arr,index+1);
     }
     
     static boolean isodd(int n){
         
         if(n%2!=0)
         {
             return true;
         }
         
         return false;
     }
 }
