import java.util.*;

public class Main {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int a=0; a<t; a++)
        {
            int n = sc.nextInt();
            
            int arr [][] = new int [n][n];
            
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }
            
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[0][j]+" ");
            }
            
            for(int i=1, j=n-2; i<=n-2; i++,j--)
            {
                System.out.print(arr[i][j]+" ");
            }
            
            for(int j=0; j<n && n!=1; j++)
            {
                System.out.print(arr[n-1][j]+" ");
            }
            
            System.out.println();
        }
    }
}
