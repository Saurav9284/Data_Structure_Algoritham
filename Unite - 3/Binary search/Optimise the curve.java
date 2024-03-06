import java.util.*;

  class Main {
     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int x=0; x<t; x++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long k = sc.nextLong();
            
            System.out.println(Function(a, b, c, k));
        }
    }
    
    public static long sum(long a, long b, long c, long k){
        
        long sum = a * k * k + b * k + c;
        return sum;
    }

    public static long Function(long a, long b, long c, long k) {
        
        if (k < c) return -1;
        
        long low = 0;
        
        long high = k - c;
        
        long ans = -1;
        
        while (low <= high) 
        {
            long mid = low + (high - low) / 2;
            
            long sum = sum(a, b, c, mid);
            
            if (sum > k) 
            {
                ans = mid;
                high = mid - 1;
            } 
            else if(sum < k)
            {
                low = mid + 1;
            } 
            else 
            {
                return mid;
            }
        }
        
        return ans;
    }
}
