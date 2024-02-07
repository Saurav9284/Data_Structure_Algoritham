import java.util.*;
 
 class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             String str = sc.next();
             
             String news = checkbracket(str);
             
             System.out.println(news);
         }
         
     }
     
     public static String checkbracket(String str)
     {
         Stack < Character > s = new Stack <Character> ();
         
         int n = str.length();
         
         for(int i=0; i<n; i++)
         {
             char ch = str.charAt(i);
             
             if(ch=='[' || ch=='{' || ch=='(')
             {
                 s.push(ch);
             }
             else
             {
                 if(s.empty())
                 {
                     return "not balanced";
                 }
                 else if(s.peek()=='(' && ch==')' || s.peek()=='{' && ch=='}' || s.peek()=='[' && ch==']')
                 {
                     s.pop();
                 }
             }
         }
         
         if(s.empty())
         {
             return "balanced";
         }
         else
         {
             return "not balanced";
         }
     }
     
 }
