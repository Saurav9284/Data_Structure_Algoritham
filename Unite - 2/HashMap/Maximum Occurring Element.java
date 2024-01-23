import java.util.*;

public class Main {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int [n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++)
        {
            int num = arr[i];
            
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
        
        int element = 0;
        int max = 0;
        
        for(Map.Entry<Integer,Integer> i : map.entrySet())
        {
            if(i.getValue()>max)
            {
                max = i.getValue();
                element = i.getKey();
            }
        }
        
        System.out.println(element);
    }
}
