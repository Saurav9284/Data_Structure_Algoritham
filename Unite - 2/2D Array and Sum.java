import java.util.*;

class Main {
    
    public static void main(String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int m = sc.nextInt();
        
        int s = sc.nextInt();
        
        int [][] arr = new int [n][m];
        
        for(int r=0; r<n; r++)
        {
            for(int c=0; c<m; c++)
            {
                arr[r][c]= sc.nextInt();
            }
        }
    
        int count = 0;
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m-2; j++)
            {
                if(arr[i][j]+arr[i][j+1]+arr[i][j+2]==s)
                {
                   count++;   
                }
            }
        }
        
        for(int i=0; i<n-2; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(arr[i][j]+arr[i+1][j]+arr[i+2][j]==s)
                {
                    count++;
                }
            }
        }
        
        for(int i=0; i<n-2; i++)
        {
            for(int j=0; j<m-2; j++)
            {
                if(arr[i][j]+arr[i+1][j+1]+arr[i+2][j+2]==s)
                {
                    count++;
                }
            }
        }
        
        for(int i=2; i<n; i++)
        {
            for(int j = m-1; j>=2; j--)
            {
                if(arr[i][j-2]+arr[i-1][j-1]+arr[i-2][j]==s)
                {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
    }
}
