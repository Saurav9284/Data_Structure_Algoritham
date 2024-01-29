import java.util.*;
  
  public class Main{
      
      public static void main(String[] args){
          
          Scanner sc = new Scanner(System.in);
          
          int n = sc.nextInt();
          
          int [] a = new int [n];
          
          for(int i=0; i<n; i++)
          {
              a[i] = sc.nextInt();
          }
          
          int [] prefix = new int [n+1];
          
          for(int i=1; i<=n; i++)
          {
              prefix[i]= prefix[i-1]+a[i-1];
          }
          
          int evencount =0;
          int oddcount =0;
          
          for(int i=0; i<=n; i++)
          {
              if(prefix[i]%2==0)
              {
                  evencount++;
              }
              else
              {
                  oddcount++;
              }
          }
          
          long ans = (long)evencount * (evencount - 1)/2 + (long)oddcount* (oddcount - 1)/2;
          
          System.out.println(ans);
      }
  }
