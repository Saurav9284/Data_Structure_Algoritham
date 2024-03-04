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
         
         int n = sc.nextInt();
         
         int q = sc.nextInt();
         
         int arr [] = new int [n];
         
         for(int i=0; i<n; i++)
         {
             arr[i] = sc.nextInt();
         }
         
         Arrays.sort(arr);
         
         for(int a=0; a<q; a++)
         {
             int x = sc.nextInt();
             
             if(fun(arr,x))
             {
                 System.out.println("YES");
             }
             else
             {
                 System.out.println("NO");
             }
         }
     }
     
     static boolean fun(int arr [], int x){
         
         int i = 0;
         int j = arr.length-1;
         
         while(i<=j)
         {
             int mid = i + (j-i)/2;
             
             if(arr[mid]==x)
             {
                 return true;
             }
             else if(arr[mid]<x)
             {
                 i = mid+1;
             }
             else
             {
                 j = mid-1;
             }
         }
         
         return false;
         
     }
 }
