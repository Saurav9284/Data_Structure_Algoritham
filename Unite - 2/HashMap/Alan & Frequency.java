import java.util.*;
 
 class Main{
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         String s = sc.next();
         
         HashMap<Character,Integer> map = new HashMap<>();
         
         for(int i=0; i<n; i++)
         {
             char ch = s.charAt(i);
             
             if(map.containsKey(ch))
             {
                 int fre = map.get(ch);
                 
                 map.put(ch,fre+1);
             }
             
             else
             {
                 map.put(ch,1);
             }
             
             
         }
         
         for(Map.Entry<Character,Integer> i : map.entrySet())
             {
                 System.out.println(i.getKey()+"-"+i.getValue());
             }
     }
 }
