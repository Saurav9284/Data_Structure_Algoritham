import java.util.*;
  
  public class Main {
      
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
              
              for(int i=0; i<n; i++)
              {
                  int sum = 0;
                  int num = arr[i];
                  
                  while(num>0)
                  {
                      int rem = num%10;
                      num = num/10;
                      sum = sum+rem;
                  }
                  
                   System.out.print(sum+" ");
              }
              
              System.out.println();
          }
      }
  }
