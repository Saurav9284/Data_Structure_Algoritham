
import java.util.*;

public class Main{
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        
        for(int a=0; a<t; a++)
        {
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
        
        int count = 0;
        
        for(Map.Entry<Character,Integer> i : map.entrySet())
        {
            if(i.getValue()%2!=0)
            {
                count++;
            }
        }
        
        if(count<=1)
        {
            System.out.println("Possible!");
        }
        else
        {
            System.out.println("Not Possible!");
        }
        
        }
    }
}
