import java.util.*;
    
    class Main{
        
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int a=0; a<t; a++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            sc.nextLine();
            
            String str = sc.nextLine();
            
            int[] arr = new int[n];
            int[] arr1 = new int[n];
            int count =0;
            
            for(int i=0; i<n; i++)
            {
                if(str.charAt(i)=='0' )
                {
                    arr[i] = 0;
                    count = 0;
                }
                else
                {
                    count++;
                    arr[i] = count;
                }
            }
            count = 0;
            for(int i=n-1; i>=0; i--)
            {
                if(str.charAt(i)=='0' )
                {
                    arr1[i] = 0;
                    count = 0;
                }
                else
                {
                    count++;
                    arr1[i] = count;
                }
            }
            
            int result = 0;
            
            for(int i=0; i<=n-k; i++)
            {
                int curr = k;
                int left = i-1, right = i+k;
                if(left >=0)
                {
                    curr += arr[left];
                }
                if(right<n)
                {
                    curr+= arr1[right];
                }
                
                result = Math.max(result, curr);
            }
            
            System.out.println(result);
        }
    }
}
