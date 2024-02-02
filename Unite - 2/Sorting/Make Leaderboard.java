import java.util.*;
 
  class Main {
      
      public static void main(String[]args){
          
          Scanner sc = new Scanner(System.in);
          
          int n = sc.nextInt();
          
          String [] name = new String [n];
          
          int [] marks = new int [n];
          
          for(int i=0; i<n; i++)
          {
              name[i] = sc.next();
              
              marks[i] = sc.nextInt();
          }
          
          for(int i=0; i<n-1; i++)
          {
              for(int j=0; j<n-i-1; j++)
              {
                  if(marks[j+1]>marks[j] || marks[j+1]==marks[j] && name[j].compareTo(name[j+1])>0)
                  {
                      int temp = marks[j];
                      marks[j] = marks[j+1];
                      marks[j+1] = temp;
                      
                      String temp1 = name[j];
                      name[j] = name[j+1];
                      name[j+1] = temp1;
                  }
              }
          }
          
          //System.out.println(Arrays.toString(name)+" "+Arrays.toString(marks));
          
          int rank = 1;
          int actualrank = 1;
          
          System.out.println(rank+" "+name[0]);
          actualrank++;
          
          for(int i=1; i<n; i++)
          {
              if(marks[i]!=marks[i-1])
              {
                  rank = actualrank;
              }
              
              actualrank++;
              
              System.out.println(rank+" "+name[i]);
          }
      }
  }
