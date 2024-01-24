import java.util.*;

public class Main{
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int a=0; a<t; a++)
        {
            String s = sc.next();
            
            int n = s.length();
            
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
            
            int redcount = 0;
            int bluecount = 0;
            
            for(char i : map.keySet())
            {
                if(i=='R')
                {
                    redcount = map.get(i);
                }
                if(i=='B')
                {
                    bluecount = map.get(i);
                }
            }
            
            int moves = Math.min(redcount,bluecount);
            
            if(moves%2==0)
            {
                System.out.println("Sachin");
            }
            else
            {
                System.out.println("Ankush");
            }
        }
    }
}
