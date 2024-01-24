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
        
        int odd = 0; 
        int even = 0;
        
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2==0)
            {
                even = even+arr[i];
            }
            else
            {
                odd = odd + arr[i];
            }
        }
        
        if(odd>even)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }
    }
}
