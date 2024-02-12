import java.util.*;
  
  public class Main{
      
  public static void main(String[] args){
      
    Scanner sc=new Scanner(System.in);
    
    int t=sc.nextInt();
    
    for(int a=0; a<t; a++)
    {
      int n=sc.nextInt();
      
      int x=sc.nextInt();
      
      int y=sc.nextInt();
      
      int[] arr=new int[n];
      int[] brr=new int[n];
      
      for(int i=0; i<n; i++)
      {
        arr[i]=sc.nextInt();
        brr[i]=sc.nextInt();
      }
      
      Arrays.sort(arr);
      Arrays.sort(brr);
      
      int count = 0;
      
      for(int i=0; i<n; i++)
      {
        if(brr[i]>arr[i]) 
        {
          count += (brr[i]-arr[i])*x;
        }
        else if(brr[i]<arr[i])
        {
          count += (arr[i]-brr[i])*y;
        }
      }
      
      System.out.println(count);
    }   
  }
}
