import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             
             int k = sc.nextInt();
             
             String s = sc.next();
             
              int minConversions = Integer.MAX_VALUE;
              int count = 0;

            for (int i = 0; i < s.length(); i++) {
              if (i >= k && s.charAt(i - k) == 'W') {
                count--;
               }

            if (s.charAt(i) == 'W') 
               {
                count++;
               }

            if (i >= k - 1)
            {
                minConversions = Math.min(minConversions, count);
            }
        }
             
             
             System.out.println(minConversions);
             
         }
     }
 }
