import java.util.*;
import java.io.*;

class Main {
    
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
    
    public static void main(String args[] ){
    
      FastReader sc = new FastReader();
        
        int t = sc.nextInt();
        
        for(int a=0; a<t; a++)
        {
            int n = sc.nextInt();
            
            int k = sc.nextInt();
            
            int arr[] = new int [n];
            
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            int i=0;
            int j=1;
            String ans = "No";
            
            while(i<n && j<n)
            {
                int sub = 0;
                sub = arr[j]-arr[i];
                
                if(sub==k)
                {
                    ans = "Yes";
                    break;
                }
                
                else if(sub<k)
                {
                    j++;
                }
                else
                {
                    i++;
                }
            }
            
            System.out.println(ans);
        }
    }
}
