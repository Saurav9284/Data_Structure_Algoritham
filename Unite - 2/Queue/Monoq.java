import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         Stack <Character> st = new Stack <>();
         
         int n = sc.nextInt();
         
         int k = sc.nextInt();
         
         String str = sc.next();
         
         for(int i=0; i<n; i++)
         {
             char ch = str.charAt(i);
             
             while(!st.isEmpty() && k-st.size()<=n-i-1 && st.peek()>ch)
             {
                 st.pop();
             }
             if(st.size()<k)
             {
                 st.push(ch);
             }
         }
         
         String solution ="";
         
         while(!st.isEmpty())
         {
             solution = st.peek() + solution;
             st.pop();
         }
        
         
         System.out.println(solution);
          
     }
 }
