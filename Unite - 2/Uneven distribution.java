import java.util.*;
  
  class Main {
      
      public static void main(String[]args){
          
          Scanner sc = new Scanner(System.in);
          
          int t = sc.nextInt();
          
          for(int a=0; a<t; a++)
          {
              int n = sc.nextInt();
              
              int k = sc.nextInt();
              
              int total = (k*(k+1)/2);
              
              if(n>=total)
              {
                  System.out.println("YES");
              }
              else
              {
                  System.out.println("NO");
              }
              
              
          }
      }
  }
