import java.util.*;
  
  class Main {
      
      public static void main(String [] args){
          
          Scanner sc = new Scanner(System.in);
          
          int t = sc.nextInt();
          
          for(int a=0; a<t; a++)
          {
              int n = sc.nextInt();
              
              int k = sc.nextInt();
              
              int [] arr = new int [n];
              
              for(int b=0; b<n; b++)
              {
                  arr[b] = sc.nextInt();
              }
              
             int min = Integer.MAX_VALUE;
             
             int sum = 0;
             
             for(int i=0; i<k; i++)
             {
                 sum = sum + arr[i];
             }
             
                if(sum<min)
                   {
                     min = sum;
                   }
             
             for(int i=k; i<n; i++)
             {
                 sum = sum - arr[i-k];
                 
                 sum = sum + arr[i];
                 
                 if(sum<min)
                 {
                     min = sum;
                 }
             }
               
             
             System.out.println(min);
       }     
   }
}
