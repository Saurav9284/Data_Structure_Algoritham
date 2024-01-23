import java.util.*;

public class Main{
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int a=0; a<t; a++)
        {
            int n = sc.nextInt();
            
            char arr [][] = new char [n][n];
            
            for(int i=0; i<n; i++)
            {
                String s = sc.next();
                
                for(int j=0; j<n; j++)
                {
                    arr[i][j] = s.charAt(j);
                }
            }
            
            int count =0;
            int i=0;
            int j=0;
            
            while(i>=0 && j>=0 && i<n && j<n)
            {
                if(arr[i][j]=='x')
                {
                    count = 0;
                    break;
                }
                else if(arr[i][j]=='R')
                {
                    arr[i][j]='x';
                    count++;
                    j++;
                }
                
                else if(arr[i][j]=='L')
                {
                    arr[i][j]='x';
                    count++;
                    j--;
                }
                
                else if(arr[i][j]=='U')
                {
                    arr[i][j]='x';
                    count++;
                    i--;
                }
                
                else if(arr[i][j]=='D')
                {
                    arr[i][j]='x';
                    count++;
                    i++;
                }
            }
            
            System.out.println(count);
        }
    }
}
