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
         
         Stack <Integer> st = new Stack <>();
         
         int count = 0;
         
         for(int i=0; i<n; i++)
         {
             while(!st.isEmpty() && st.peek()>=arr[i])
             {
                 st.pop();
             }
             if(st.isEmpty())
             {
                 count++;
             }
             
             st.push(arr[i]);
         }
         
         System.out.println(count);
     }
 }
