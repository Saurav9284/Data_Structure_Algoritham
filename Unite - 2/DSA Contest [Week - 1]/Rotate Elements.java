import java.util.*;
import java.io.*;

public class Main {
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    public static void main(String[]args){
        
        FastReader sc = new FastReader();
        
        int n = sc.nextInt();
        
        int mat [][] = new int [n][n];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        
        int row = 0; 
        int col = 0;
        int lastrow = n; 
        int lastcol = n;
        int pre,curr;
        
        while(row<lastrow || col<lastcol)
        {
            if(row+1 == lastrow || col+1 == lastcol)
            {
                break;
            }
            
            pre = mat[row+1][col];
            
            for(int i=col; i<lastcol; i++)
            {
                curr = mat[row][i];
                mat[row][i] = pre;
                pre = curr;
            }
            row++;
            
            for(int i=row; i<lastrow; i++)
            {
                curr = mat[i][lastcol-1];
                mat[i][lastcol-1] = pre;
                pre = curr;
            }
            lastcol--;
            
            if(row<lastrow)
            {
                for(int i=lastcol-1; i>=col; i--)
                {
                    curr = mat[lastrow-1][i];
                    mat[lastrow-1][i] = pre;
                    pre = curr;
                }
            }
            
            lastrow--;
            
            if(col<lastcol)
            {
                for(int i=lastrow-1; i>=row; i--)
                {
                    curr = mat[i][col];
                    mat[i][col] = pre;
                    pre = curr;
                }
            }
            
            col++;
        }
        
        StringBuilder bag = new StringBuilder();
        
         for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                bag.append(mat[i][j]+" ");
            }
            
            bag.append("\n");
        }
       
         System.out.println(bag);
    }
}
