import java.util.*;
 
 public class Main {
     
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
             
             Stack <Integer> st = new Stack <>();
             
             int ans [] = new int [n];
             
             StringBuilder sb = new StringBuilder();
             
             for(int i=n-1; i>=0; i--)
             {
                 int num = arr[i];
                 
                     while(!st.isEmpty() && st.peek()<=arr[i])
                     {
                         st.pop();
                     }
                     
                     if(st.isEmpty())
                     {
                         ans[i] = -1;
                         st.push(num);
                     }
                     
                     else
                     {
                         ans[i] = st.peek();
                     }
             }
             
             for(int i: ans)
             {
                 sb.append(i+" ");
             }
             
             System.out.println(sb);
         }
     }
 }
