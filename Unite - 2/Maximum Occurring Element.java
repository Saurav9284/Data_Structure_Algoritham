import java.util.*;

class Main {
    
    public static void main(String args[] )  {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int [] arr = new int [n];
        
        for(int a=0; a<n; a++)
        {
            arr[a]= sc.nextInt();
        }
        
        int max = 0; 
        int element = 0;
        
        HashMap <Integer,Integer> map = new HashMap<> ();
        
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
            if(map.get(num)>max)
            {
                max = map.get(num);
                element = num;
            }
         }
            
           System.out.print(element); 
        }
        
        
    }
