import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         Stack <Integer> s = new Stack <>();
         
         for(int a=0; a<n; a++)
         { 
             int num = sc.nextInt();
             
             if(num ==1)
             {
                 s.push(sc.nextInt());
             }
             
             else if (num==2)
             {
                 if(!s.isEmpty())
                 {
                     System.out.println(s.peek());
                     s.pop();
                 }
                 else if(s.empty())
                 {
                     System.out.println("No Books");
                 }
             }
             
             else if(num ==3)
             {
                 if(!s.isEmpty())
                 {
                     System.out.println(s.peek());
                 }
                 else if(s.empty())
                 
                 {
                     System.out.println("No Books");
                 }
             }
         }
     }
 }
