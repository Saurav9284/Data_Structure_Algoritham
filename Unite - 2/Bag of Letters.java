import java.util.*;

public class Main{
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String str = sc.next();
        
        int m = sc.nextInt();
        
        String a = sc.next();
        
       HashMap<Character,Integer> map = new HashMap<>();
       
       for(int i=0; i<n; i++)
       {
           char ch = str.charAt(i);
           
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
       
       int count = 0;
       
       for(int i=0; i<m; i++)
       {
           char cha = a.charAt(i);
           
           if(map.containsKey(cha))
           {
               count++;
           }
       }
       
       if(count==m)
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }
      
    }
}
