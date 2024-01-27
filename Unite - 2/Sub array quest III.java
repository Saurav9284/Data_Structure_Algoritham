import java.util.*;

public class Main {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int a=0; a<t; a++)
        {
            int n = sc.nextInt();
            
            int arr [] = new int [n];
            
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            int count = 0;

             for (int i = 0; i < n; i++) {
                 
                  if (arr[i] % 2 == 0) {
                      
                     for(int j=i+1; j<n; j++)
                     {
                         if(arr[j]%2!=0)
                          {
                            count++;
                          }
                    }
                 
                 }
             }
             System.out.println(count);
      }
   }
}
