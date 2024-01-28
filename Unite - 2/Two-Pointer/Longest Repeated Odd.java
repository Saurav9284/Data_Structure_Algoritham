import java.util.*;
 
 public class Main{
     
     public static void main(String[] args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int [] arr = new int [n];
         
         for(int a=0; a<n; a++)
         {
             arr[a]= sc.nextInt();
         }
         
        int count = 0;
        int start = 0;
        int end = 0;
        
        while (end < n) 
        {
            if (arr[end] % 2 != 0)
            {
                if (end == 0 || arr[end] != arr[end - 1]) {
                    // New sequence starts
                    start = end;
                }
                
                if (end == n - 1 || arr[end] != arr[end + 1]) {
                    // Current sequence ends
                    count = Math.max(count, end - start + 1);
                }
            }
            
            end++;
        }
        
         System.out.print(count);
     }
 }
