import java.util.*;
 
 public class Main {
     
     public static void main(String[]args) {
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int p = sc.nextInt();
         
         int q = sc.nextInt();
         
         int arr [] = new int [n];
         
         for(int i=0; i<n; i++)
         {
             arr[i] = i+1;
         }
         
         int sachine [] = new int [p];
         
         for(int i=0; i<p; i++)
         {
             sachine[i] = sc.nextInt();
         }
         
         int ankush [] = new int [q];
         
         for(int i=0; i<q; i++)
         {
             ankush[i] = sc.nextInt();
         }
         
         HashMap <Integer,Integer> map = new HashMap <>();
         
         for(int i=0; i<p; i++)
         {
             int num = sachine[i];
             
             if(map.containsKey(num))
             {
                 int fre = map.get(num);
                 map.put(num,fre+1);
             }
             
             else
             {
                 map.put(num,1);
             }
         }
         
         for(int i=0; i<q; i++)
         {
             int num = ankush[i];
             
             if(map.containsKey(num))
             {
                 int fre = map.get(num);
                 map.put(num,fre+1);
             }
             
             else
             {
                 map.put(num,1);
             }
         }
         
         int count = 0;
         
         for(int i=0; i<n; i++)
         {
             int num = arr[i];
             
             if(map.containsKey(num))
             {
                 count++;
             }
         }
         
         if(count==n)
         {
             System.out.println("Winner");
         }
         else
         {
             System.out.println("Loser");
         }
     }
 }
