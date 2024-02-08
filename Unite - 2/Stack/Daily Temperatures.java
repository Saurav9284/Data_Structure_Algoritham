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
              
              int ans [] = new int [n];
              
              Stack <Integer> st = new Stack <> ();
              
              for(int i=0; i<n; i++)
              {
                  while(!st.isEmpty() && arr[st.peek()] < arr[i])
                  {
                      //System.out.println(st.peek());
                      
                      ans[st.peek()] = i-st.peek();
                      st.pop();
                  }
                  st.push(i);
              }
              
              StringBuilder sb = new StringBuilder();
              
              for(int i=0; i<n; i++)
              {
                  sb.append(ans[i]+" ");
              }
              System.out.println(sb);
          }
      }
  }
