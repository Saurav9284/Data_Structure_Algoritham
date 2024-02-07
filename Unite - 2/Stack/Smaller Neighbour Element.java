import java.util.*;
 
 class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int [] arr = new int [n];
         
         for(int i=0; i<n; i++)
         {
             arr[i] = sc.nextInt();
         }
         
          Stack <Integer> s = new Stack <Integer> ();
         
          StringBuilder sb = new StringBuilder();
          
          
          for(int i=0; i<n; i++)
          {
              if(s.empty())
              {
                  sb.append(-1+" ");
              }
              
              else if(!s.isEmpty() && s.peek()<arr[i])
              {
                  sb.append(s.peek()+" ");
              }
              
              else if(!s.isEmpty() && s.peek()>=arr[i])
              {
                  while(!s.isEmpty() && s.peek()>=arr[i])
                  {
                      s.pop();
                  }
                  
                  if(s.empty())
                  {
                      sb.append(-1+" ");
                  }
                  else
                  {
                      sb.append(s.peek()+" ");
                  }
                  
              }
              
              s.push(arr[i]);
          }
         
        System.out.print(sb);
     }
 }
