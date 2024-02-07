import java.util.*;
  
  class Main {
      
      public static void main(String[]args){
          
          Scanner sc = new Scanner(System.in);
          
          Stack <Integer> stack = new Stack <Integer> ();
          
          int t = sc.nextInt();
          
          for(int a=0; a<t; a++)
          { 
              int num = sc.nextInt();
             
              if(num==1)
              {
                  stack.push(sc.nextInt());
              }
              if(num==2)
              {
                 if(!stack.empty())
                      {
                         stack.pop();
                      }
              } 
              if(num==3)
              {  
                  if(!stack.empty())
                  {
                     System.out.println(stack.peek());
                  }
                  else
                  {
                      System.out.println("Empty!");
                  }
              }
         }
                  
       }
              
    }
