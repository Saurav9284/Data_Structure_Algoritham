import java.util.*;
  
  class Main {
      
      public static void main(String[]args){
          
          Scanner sc = new Scanner(System.in);
          
          int n = sc.nextInt();
          
          String [] name = new String [n];
          
          int [] height = new int [n];
          
          int [] weight = new int [n];
          
          int [] iqs = new int [n];
          
          for(int i=0; i<n; i++)
          {
              name[i] = sc.next();
              
              height[i] = sc.nextInt();
              
              weight[i] = sc.nextInt();
              
              iqs[i] = sc.nextInt();
          }
          
          MeritList(name,height,weight,iqs);
          
          for(int i=n-1; i>=n-8; i--)
          {
              System.out.println(name[i]);
          }
      }  
          
         static void MeritList(String [] name,int[]height,int[]weight,int []iqs){
             
            int n = name.length;
            
          for(int i=0; i<n-1; i++)
          {
              for(int j=0; j<n-i-1; j++)
              {
                  if(IsGreater(j,name,height,weight,iqs))
                  {
                      swap(name,j,j+1);
                      swap(height,j,j+1);
                      swap(weight,j,j+1);
                      swap(iqs,j,j+1);
                  }
              }
          }
      } 
       static void swap(int [] arr, int i, int j)
       {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
       }
       
       static void swap(String [] arr, int i, int j)
       {
           String temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
       }
       
       static boolean IsGreater(int j, String [] name, int [] height, int [] weight, int [] iqs)
       {
           if(iqs[j]>iqs[j+1])
           {
               return true;
           }
           else if(iqs[j]<iqs[j+1])
           {
               return false;
           }
           
           if(height[j]>height[j+1])
           {
               return true;
           }
           else if(height[j]<height[j+1])
           {
               return false;
           }
           
           if(weight[j]<weight[j+1])
           {
               return true;
           }
           else if(weight[j]>weight[j+1])
           {
               return false;
           }
           
           int k=0;
           
           while(k<name[j].length() && k<name[j+1].length())
           {
               if(name[j].charAt(k)<name[j+1].charAt(k))
               {
                   return true;
               }
          else if(name[j].charAt(k)>name[j+1].charAt(k))
               {
                   return false;
               }
               
               k++;
           }
           if(k==name[j].length())
           {
           return true;
           }
           return false;
       }
       
  }
