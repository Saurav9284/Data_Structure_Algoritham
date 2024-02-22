import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         String s = sc.next();
         
         print(s,0);
     }
     
     static void print(String s, int index){
         
         if(index>=s.length())
         {
             return;
         }
         
         System.out.println(s.charAt(index));
         
         print(s,index+1);
     }
 }
