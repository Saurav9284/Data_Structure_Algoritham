import java.util.*;
 
 class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             
             int [] arr = new int [n];
             
             for(int i=0; i<n; i++)
             {
                 arr[i] = sc.nextInt();
             }
             
             Stack <Integer> s = new Stack <> ();
             
             int [] ans = new int [n];
             
             for(int i=n-1; i>=0; i--)
             {
                 if(s.empty())
                 {
                     ans[i] = -1;
                 }
                 
                 else if(!s.isEmpty() && s.peek()>arr[i])
                 {
                     ans[i] = s.peek();
                 }
                 
                 else if(!s.isEmpty() && s.peek()<=arr[i])
                 {
                     while(!s.isEmpty() && s.peek()<=arr[i])
                     {
                         s.pop();
                     }
                     
                     if(s.empty())
                     {
                         ans[i] = -1;
                     }
                     
                     else
                     {
                         ans[i] = s.peek();
                     }
                 }
                 
                 s.push(arr[i]);
                 
             }
                 
                 StringBuilder str = new StringBuilder();
                 for(int i=0; i<n; i++)
                 {
                     str.append(ans[i]+" ");
                 }
                 
                 System.out.println(str);
         }
         
     }
 }
