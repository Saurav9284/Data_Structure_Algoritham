import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         String s = sc.next();
         
         for(int i=0; i<n; i++)
         {
             if(i%2!=0)
             {
                 System.out.println(s.charAt(i));
             }
         }
     }
 }
