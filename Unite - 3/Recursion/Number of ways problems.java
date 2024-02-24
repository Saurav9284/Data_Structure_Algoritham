import java.util.*;
 
 public class Main {
     
     public static void main(String [] args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int count = ways(n);
         
         System.out.println(count);
     }
     
     static int ways(int n)
     {
         
      if(n<=1)
       {
            return 1;
       } 
      else if (n == 2)
       {
            return 2;
       }
        
        int arr [] = new int[n + 1];
        
        arr[0] = 1;
        
        arr[1] = 1;
        
        arr[2] = 2;
        
        for(int i=3; i<=n; i++)
        {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        
        return arr[n];
    }
 }
