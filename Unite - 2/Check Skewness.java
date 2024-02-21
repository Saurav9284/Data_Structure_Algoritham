import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); 

        for(int a=0; a<t; a++)
        {
            int n = sc.nextInt(); 
            
            int odd = 0;
            int even = 0;
            
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 == 0)
                    {
                        even++;
                    } else
                    {
                        odd++;
                    }
                    
                    if (n / i != i)
                    {
                        if ((n / i) % 2 == 0)
                        {
                            even++;
                        } else
                        {
                            odd++;
                        }
                    }
                }
            }
            
            if (odd > even)
            {
                System.out.println("Odd Skewed");
            } 
            else if (even > odd)
            {
                System.out.println("Even Skewed");
            } 
            else
            {
                System.out.println("Not Skewed");
            }
        }
        
    }
}
