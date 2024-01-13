public static void countDigits(int n,int[] arr){
    //write your code here
    int ones = 0;
    int twos = 0;
    int zeros = 0;
    
    for(int i = 0; i < n; i++)
    {
        if(arr[i]==0)
        {
            zeros++;
        }
        else if(arr[i]==1)
        {
            ones++;
        }
        else if(arr[i]==2)
        {
            twos++;
        }
    }
    
    System.out.println(zeros+" "+ones+" "+twos);
    
  }
