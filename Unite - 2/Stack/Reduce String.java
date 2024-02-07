import java.util.*;
 
 class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         String str = sc.next();
         
         int n = str.length();
         
         Stack <Character> stack = new Stack <>();
         
         for(int i=0; i<n; i++)
         {
             char ch = str.charAt(i);
             
             if(stack.empty() || stack.peek()!=ch)
             {
                 stack.push(ch);
             }
             else
             {
                 if(stack.peek()==ch)
                 {
                     stack.pop();
                 }
             }
         }
         
         if(stack.empty())
         {
             System.out.println("Empty String");
         }
         else
         {
             for(Character k: stack)
             {
                 System.out.print(k);
             }
         }
         
         
     }
 }
