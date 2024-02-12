import java.util.*;
 
 public class Main{
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             
             int arr [] = new int [n];
             
             for(int i=0; i<n; i++)
             {
                 arr[i] = sc.nextInt();
             }
             
             StringBuilder sb = new StringBuilder();
             
             int ans [] = new int [n];
             
             Stack <Integer> st = new Stack <>();
             
             for(int i=0; i<n; i++)
             {
                 while(!st.isEmpty() && arr[st.peek()] <= arr[i])
                 {
                     st.pop();
                 }
                 ans[i] = st.isEmpty()?(i+1):(i-st.peek());
                 st.push(i);
             }
             
             for(int i : ans)
             {
                 sb.append(i+" ");
             }
             
             System.out.println(sb);
         }
     }
 }
