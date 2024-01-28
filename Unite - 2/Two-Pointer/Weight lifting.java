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
        
        int t = sc.nextInt();
        
        for(int a=0; a<t; a++)
        {
            int n = sc.nextInt();
            
            int arr [] = new int [n];
            
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
          int i=0; 
          int j=n-1;
          int totalharry = 0;
          int totaljhon = 0;
          int harry = 0;
          int jhon = 0;
              
          while(i<=j)
          {
              harry = 0;
              
              while(harry<=jhon && i<=j)
                  {
                      harry += arr[i];
                      i++;
                   }
                   
                   totalharry += harry;
            
              jhon = 0;
              
              while(jhon<=harry && i<=j)
                  {
                      jhon += arr[j];
                      j--;
                   }
                   
                   totaljhon += jhon;       
              
          }
          
          System.out.println(totalharry+" "+totaljhon);
            
        }
    }
 }
