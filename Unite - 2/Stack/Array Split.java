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
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }     
     
     public static void main(String[]args){
         
         FastReader sc = new FastReader();
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             
             int arr [] = new int [n];
             
             for(int i=0; i<n; i++)
             {
                 arr[i] = sc.nextInt();
             }
             
            int count=0;
            int total=0;
            int leftsum=0;
            int rightsum=0;
            
            for(int i=0; i<n; i++)
            {
                total += arr[i];
            }
            
            for(int i=0; i<n-1; i++)
            {
                rightsum += arr[i];
                leftsum = total - rightsum;
                
                if(rightsum>=leftsum)
                {
                    count++;
                }
            }
             
             System.out.println(count);
         }
     }
 }
