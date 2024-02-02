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
        
        int digitsum [] = new int [n];
        
        for(int i=0; i<n; i++)
        {
            int num = arr[i];
            int sum = 0;
            
            while(num>0)
            {
                int rem = num%10;
                sum = sum + rem;
                num = num/10;
            }
            
            digitsum[i]=sum;
        }
        
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(digitsum[j]>digitsum[j+1] || digitsum[j]==digitsum[j+1] && arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    int tempo = digitsum[j];
                    digitsum[j] = digitsum[j+1];
                    digitsum[j+1] = tempo;
                }
            }
        }
        
    StringBuilder sb = new StringBuilder();
        
        for(int i : arr)
        {
            sb.append(i+" ");
        }
        
        System.out.println(sb);
        
        }
    }
        
}
