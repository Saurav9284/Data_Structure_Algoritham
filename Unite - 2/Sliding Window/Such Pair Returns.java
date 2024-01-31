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
         
         int k = sc.nextInt();
         
         int arr[] = new int [n];
         
         for(int i=0; i<n; i++)
         {
             arr[i] = sc.nextInt();
         }
         
         Arrays.sort(arr);
         
         int i=0;
         int j=n-1;
         int ans = -1;
         
         while(i<j)
         {
             int sum = 0;
             
             sum = arr[i] + arr[j];
             
             if(sum<k)
             {
                 i++;
             }
             
             else if (sum==k)
             {
                 ans = 1;
                 break;
             }
             
             else if(sum>k)
             {
                 j--;
             }
         }
         
         System.out.println(ans);
         
         }
     }
 }
