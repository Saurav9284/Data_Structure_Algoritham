import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int arr [] = new int [n];
         
         for(int i=0; i<n; i++)
         {
             arr[i] = sc.nextInt();
         }
         
         checkIfSortRotated(arr, n);
     }
     
     static void checkIfSortRotated(int arr [],int n)
    {
        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;

        int minIndex = -1;

       
        for(int i=0; i<n; i++)
        {
            if(arr[i] < minEle)
            {
                minEle = arr[i];
                minIndex = i;
            }
        }

        int flag1 = 1;

        
        for(int i=1; i<minIndex; i++)
        {
            if(arr[i] < arr[i-1])
            {
                flag1 = 0;
                break;
            }
        }

        int flag2 = 1;

        
        for(int i=minIndex+1; i<n; i++)
        {
            if (arr[i] < arr[i-1])
            {
                flag2 = 0;
                break;
            }
        }
        

        if(flag1==flag2 && (arr[n-1] < arr[0]))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }

 }
