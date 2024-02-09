import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
        
             int sum = 0;
             
             int remender = 0;
             
            HashSet<Integer> list = new HashSet <>();
            
            while(list.add(n))
            {
                sum = 0;
                
                while(n>=1)
                {
                    remender = n%10;
                    
                    sum = sum + remender*remender;
                    
                    n = n/10;
                }
                
                n = sum;
            }
                
                if(sum==1)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
         }
     }
 }
