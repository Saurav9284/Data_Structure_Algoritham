import java.util.*;
  
  class Main {
      
      public static void main(String[]args){
          
          Scanner sc = new Scanner(System.in);
          
          int t = sc.nextInt();
          
          for(int a=0; a<t; a++)
          {
              int n = sc.nextInt();
              
              int k = sc.nextInt();
              
              int [] arr = new int [n];
              
              for(int i=0; i<n; i++)
              {
                  arr[i] = sc.nextInt();
              }
              
              Arrays.sort(arr);
              
              // 1 2 12 13 15 17 k=5// 
              
              
              int i=0;
              int j=0;
              int count = 0;
              
              while(j<n)
              {
                  if(arr[j]-arr[i]<=k)
                  {
                      count = Math.max(count,j-i+1);
                      j++;
                  }
                  else{
                      i++;
                  }
              }
              
              System.out.println(count);
          }
      }
  }
