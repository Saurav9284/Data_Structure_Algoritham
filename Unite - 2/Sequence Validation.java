import java.io.*;
 import java.util.*;
 
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
            int arr1 [] = new int [n];
            
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            for(int i=0; i<n; i++)
            {
                arr1[i] = sc.nextInt();
            }
            
            
            Stack <Integer> st = new Stack <>();
            
            int count = 0;
            
            for(int i=0; i<n; i++)
            {
                st.push(arr[i]);
            
               while(!st.isEmpty() && st.peek()==arr1[count])
               {
                   st.pop();
                   count++;
               }
            
            }
            
            if(st.isEmpty())
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
   }
}
