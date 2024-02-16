import java.util.*;
  
  class Main {
      
      public static void main(String[]args){
          
          Scanner sc = new Scanner(System.in);
          
          int t = sc.nextInt();
          
          for(int a=0; a<t; a++)
          {
          
          String str = sc.next();
          
          String res = str.toLowerCase();
          
          int n = str.length();
        
          
          for(int i=0; i<n; i++)
          {   
             
              char ch = res.charAt(i);
             
              if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
              {
                  continue;
              }
              else
              {  
                  
                  System.out.print("."+ch);
              }
          }
          System.out.println();
          
          } 
      }
  }
