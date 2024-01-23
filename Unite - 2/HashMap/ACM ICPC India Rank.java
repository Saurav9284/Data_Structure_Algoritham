import java.util.*;

public class Main {
    
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=1; i<=n; i++)
        {
            String s = sc.next();
            
            map.put(s,i);
        }
        
        String check = "India";
        
        System.out.println(map.get(check));
    }
}
