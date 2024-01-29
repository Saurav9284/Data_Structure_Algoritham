import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int n = sc.nextInt();
             
             int arr [] = new int [n];
             
             for(int i=0; i<n; i++)
             {
                 arr[i] = sc.nextInt();
             }
             
            int count =0;
            int count1=0;
            int rick=0;
            int rich=n-1;
            int countsum =0;
            int count1sum=0;
            
            while (rick<=rich)
            {
                if(countsum<=count1sum*2)
                {
                    count++;
                    countsum += arr[rick++];
                }
                else
                {
                    count1++;
                    count1sum += arr[rich--];
                }
            }
         
         System.out.println((count)+" "+(count1));
        }
     }
 }
