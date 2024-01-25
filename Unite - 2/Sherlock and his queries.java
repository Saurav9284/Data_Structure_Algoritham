import java.util.*;
  
  public class Main{
      
      public static void main(String[]args){
          
          Scanner sc = new Scanner(System.in);
          
          int t= sc.nextInt();
          
          for(int a=0; a<t; a++)
          {
              int n = sc.nextInt();
              int m = sc.nextInt();
              
              int [][] arr = new int [n][m];
              
              for(int r=0; r<n; r++)
              {
                  for(int c=0; c<m; c++)
                  {
                      arr[r][c]=0;
                  }
              }
              
              
              int [] row = new int[n];
              int [] col = new int[m];
              
              int q = sc.nextInt();
              
              for(int i=0; i<q; i++)
              {
                  int type = sc.nextInt();
                  int index = sc.nextInt();
                  
                  if(type==0)
                  {
                      row[index]++;
                  }
                  else
                  {
                      col[index]++;
                  }
              }
              
              int count =0;
              for(int i=0; i<n; i++)
              {
                  for(int j=0; j<m; j++)
                  {
                    arr[i][j] = row[i]+col[j];  
                      if(arr[i][j]%2!=0)
                      {
                          count++;
                      }
                  }
              }
              
              System.out.println(count);
          }
      }
  }
