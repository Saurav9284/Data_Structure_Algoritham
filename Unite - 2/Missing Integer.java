import java.util.*;
 
 class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int sum =0;
         int count =0;
         
         while(sc.hasNext())
         {
             sum = sum + sc.nextInt();
             count++;
         }
         
         int x = (count+1)*(count+2)/2;
         
         System.out.println(x-sum);
         
     }
 }
