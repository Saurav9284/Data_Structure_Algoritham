import java.util.*;

public class Main {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int [][] arr = new int [n][n];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        
        for(int i=0; i<n/2; i++)
        {
            c1 = c1 + arr[i][0]; 
        }
        
        for(int j=0; j<n; j++)
        {
            c2 = c2 + arr[n/2][j];
        }
        
        for(int i=n-1; i>n/2; i--)
        {
            c3 = c3 + arr[i][n-1];
        }
        
        int ans = 3*c1+c2+2*c3;
        
        System.out.println(ans);
    }
}
