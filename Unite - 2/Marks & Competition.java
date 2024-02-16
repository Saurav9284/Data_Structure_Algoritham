import java.util.*;
 
 class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int [] arr = new int [n];
         
         for(int i=0; i<n; i++)
         {
             arr[i] = sc.nextInt();
             
         }
         
        Stack <Integer> s = new Stack <>();
        
        for(int i=0; i<n; i++)
        {
            int num = arr[i];
            
            if(s.empty())
            {
                s.push(num);
            }
            
            else if(!s.isEmpty() && s.peek()==num)
            {
                s.push(num);
            }
            
            while(!s.isEmpty() && s.peek()<num)
            {
                s.pop();
            }
            
            s.push(num);
        }
        
        for(Integer k : s)
        {
            System.out.print(k+" ");
        }
     }
 }
