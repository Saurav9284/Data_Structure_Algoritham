import java.util.*;

public class Main{
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int a=0; a<t; a++)
        {
            int n = sc.nextInt();
            
            int m = sc.nextInt();
            
            char arr [][] = new char [n][m];
            
            for(int i=0; i<n; i++)
            {
                String s = sc.next();
                
                for(int j=0; j<m; j++)
                {
                    arr[i][j] = s.charAt(j);
                }
            }
            
            int count = 0;
            
            for(int i=0; i<n; i++)
            {
                if(arr[i][m-1]=='R')
                {
                    count++;
                }
            }
            
            for(int j=0; j<m; j++)
            {
                if(arr[n-1][j]=='D')
                {
                    count++;
                }
            }
            
            System.out.println(count);
            
            
        }
    }
}
