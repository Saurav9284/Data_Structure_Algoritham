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
         
         int line [] = new int [n];
         
         for(int i=0; i<n; i++)
         {
             line[i] = sc.nextInt();
         }
         
         int move = -1;
         
         for(int i=0; i<n; i++)
         {
             for(int j=0; j<n; j++)
             {
                 if(arr[i]==line[j])
                 {
                     move++;
                     line[j] = 0;
                     break;
                 }
                 
                 else if(line[j]==0)
                 {
                     continue;
                 }
                 move++;
             }
         }
         
         System.out.println(move);
     }
 }
